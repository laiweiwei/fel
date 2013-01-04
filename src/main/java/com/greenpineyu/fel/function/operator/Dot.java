package com.greenpineyu.fel.function.operator;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.greenpineyu.fel.Expression;
import com.greenpineyu.fel.common.ArrayUtils;
import com.greenpineyu.fel.common.Null;
import com.greenpineyu.fel.common.ReflectUtil;
import com.greenpineyu.fel.compile.FelMethod;
import com.greenpineyu.fel.compile.SourceBuilder;
import com.greenpineyu.fel.context.FelContext;
import com.greenpineyu.fel.function.CommonFunction;
import com.greenpineyu.fel.function.Function;
import com.greenpineyu.fel.parser.FelNode;
import com.greenpineyu.fel.security.SecurityMgr;

public class Dot implements Function {

	private SecurityMgr securityMgr;

	public SecurityMgr getSecurityMgr() {
		return securityMgr;
	}

	public void setSecurityMgr(SecurityMgr securityMgr) {
		this.securityMgr = securityMgr;
	}

	static final Map<Class<?>, Class<?>> PRIMITIVE_TYPES;
	static {
		PRIMITIVE_TYPES = new HashMap<Class<?>, Class<?>>();
		PRIMITIVE_TYPES.put(Boolean.class, Boolean.TYPE);
		PRIMITIVE_TYPES.put(Byte.class, Byte.TYPE);
		PRIMITIVE_TYPES.put(Character.class, Character.TYPE);
		PRIMITIVE_TYPES.put(Double.class, Double.TYPE);
		PRIMITIVE_TYPES.put(Float.class, Float.TYPE);
		PRIMITIVE_TYPES.put(Integer.class, Integer.TYPE);
		PRIMITIVE_TYPES.put(Long.class, Long.TYPE);
		PRIMITIVE_TYPES.put(Short.class, Short.TYPE);
	}
	public static final String DOT = ".";

	
	public String getName() {
		return DOT;
	}

	
	public Object call(FelNode node, FelContext context) {
		List<FelNode> children = node.getChildren();
		Object left = children.get(0);
		if (left instanceof Expression) {
			Expression exp = (Expression) left;
			left = exp.eval(context);
		}
		FelNode right = children.get(1);
		FelNode exp = right;
		Class<?>[] argsType = new Class<?>[0];
		Object[] args = CommonFunction.evalArgs(right, context);
		if (!ArrayUtils.isEmpty(args)) {
			argsType = new Class[args.length];
			for (int i = 0; i < args.length; i++) {
				if (args[i] == null) {
					argsType[i] = Null.class;
					continue;
				}
				argsType[i] = args[i].getClass();
			}
		}
		Method method = null;
		Class<?> cls = left instanceof Class<?> ? (Class<?>) left : left.getClass();

		String methodName = right.getText();
		method = findMethod(cls, methodName, argsType);
		if (method == null) {
			String getMethod = "get";
			method = findMethod(cls, getMethod, new Class<?>[] { String.class });
			args = new Object[] { exp.getText() };
		}
		if (method != null) {
			return invoke(left, method, args);
		}
		return null;
	}

	private Method findMethod(Class<?> cls, String methodName, Class<?>[] argsType) {
		Method method = ReflectUtil.findMethod(cls, methodName, argsType);
		return getCallableMethod(method);
	}

	private Method getMethod(Class<?> cls, String methodName, Class<?>[] argsType) {
		Method method = ReflectUtil.getMethod(cls, methodName, argsType);
		return getCallableMethod(method);
	}

	private Method getCallableMethod(Method m) {
		if (m == null || securityMgr.isCallable(m)) {
			return m;
		}
		throw new SecurityException("安全管理器[" + securityMgr.getClass().getSimpleName() + "]禁止调用方法[" + m.toString() + "]");
	}

	/**
	 * 调用方法
	 * 
	 * @param obj
	 * @param method
	 * @param args
	 * @return
	 */
	public static Object invoke(Object obj, Method method, Object[] args) {
		try {
			return method.invoke(obj, args);
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		return null;
	}

	
	public FelMethod toMethod(FelNode node, FelContext context) {

		StringBuilder sb = new StringBuilder();
		List<FelNode> children = node.getChildren();
		FelNode l = children.get(0);
		SourceBuilder leftMethod = l.toMethod(context);
		Class<?> cls = leftMethod.returnType(context, l);
		String leftSrc = leftMethod.source(context, l);
		if (cls.isPrimitive()) {
			Class<?> wrapperClass = ReflectUtil.toWrapperClass(cls);
			// 如果左边返回的值的基本类型，要转成包装类型[eg:((Integer)1).doubleValue()]
			sb.append("((").append(wrapperClass.getSimpleName()).append(")").append(leftSrc).append(")");
		} else {
			sb.append(leftSrc);
		}
		sb.append(".");
		Method method = null;
		FelNode rightNode = children.get(1);
		List<FelNode> params = rightNode.getChildren();
		List<SourceBuilder> paramMethods = new ArrayList<SourceBuilder>();
		Class<?>[] paramValueTypes = null;
		boolean hasParam = params != null && !params.isEmpty();
		String rightMethod = rightNode.getText();
		String rightMethodParam = "";
		if (hasParam) {
			// 有参数
			paramValueTypes = new Class<?>[params.size()];
			for (int i = 0; i < params.size(); i++) {
				FelNode p = params.get(i);
				SourceBuilder paramMethod = p.toMethod(context);
				paramMethods.add(paramMethod);
				paramValueTypes[i] = paramMethod.returnType(context, p);
			}
			// 根据参数查找方法
			method = findMethod(cls, rightNode.getText(), paramValueTypes);
			if (method != null) {
				Class<?>[] paramTypes = method.getParameterTypes();
				for (int i = 0; i < paramTypes.length; i++) {
					Class<?> paramType = paramTypes[i];
					FelNode p = params.get(i);
					String paramCode = getParamCode(paramType, p, context);
					rightMethodParam += paramCode + ",";
				}
				rightMethod = method.getName();
			}
		} else {
			method = findMethod(cls, rightNode.getText(), new Class<?>[0]);
			if (method == null) {
				// 当没有找到方法 ，直接使用get方法来获取属性
				method = getMethod(cls, "get", new Class<?>[] { String.class });
				if (method != null) {
					rightMethod = "get";
					rightMethodParam = "\"" + rightNode.getText() + "\"";
				}
			} else {
				rightMethod = method.getName();
			}
		}

		if (method != null) {
		}
		if (rightMethodParam.endsWith(",")) {
			rightMethodParam = rightMethodParam.substring(0, rightMethodParam.length() - 1);
		}
		rightMethod += "(" + rightMethodParam + ")";

		sb.append(rightMethod);

		FelMethod returnMe = new FelMethod(method == null ? null : method.getReturnType(), sb.toString());
		return returnMe;
	}

	/**
	 * 获取参数代码
	 * 
	 * @param paramType 方法声明的参数类型
	 * @param paramValueType 参数值的类型
	 * @param paramMethod
	 * @return
	 */
	public static String getParamCode(Class<?> paramType, FelNode node, FelContext ctx) {
		// 如果类型相等（包装类型与基本类型（int和Integer)也认为是相等 ），直接添加参数。
		String paramCode = "";
		SourceBuilder paramMethod = node.toMethod(ctx);
		Class<?> paramValueType = paramMethod.returnType(ctx, node);
		if (ReflectUtil.isTypeMatch(paramType, paramValueType)) {
			paramCode = paramMethod.source(ctx, node);
		} else {
			// 如果类型不匹配，使用强制转型
			String className = null;
			Class<?> wrapperClass = ReflectUtil.toWrapperClass(paramType);
			if (wrapperClass != null) {
				className = wrapperClass.getName();
			} else {
				className = paramType.getName();
			}
			paramCode = "(" + className + ")" + paramMethod.source(ctx, node);
		}
		return paramCode;
	}

}
