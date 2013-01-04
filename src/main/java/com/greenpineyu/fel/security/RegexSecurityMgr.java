package com.greenpineyu.fel.security;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;

import com.greenpineyu.fel.Fel;

public class RegexSecurityMgr implements SecurityMgr {

	private Map<String, Pattern> callableMap;
	private Map<String, Pattern> uncallableMap;

	{
		callableMap = new HashMap<String, Pattern>();
		uncallableMap = new HashMap<String, Pattern>();
	}

	public RegexSecurityMgr(Set<String> callables, Set<String> uncallables) {
		convert(callables, this.callableMap);
		convert(uncallables, this.uncallableMap);
	}

	/**
	 * 编译成正则表达式，保存到Map中
	 * @param callableSet
	 * @param callableMapDest
	 */
	private void convert(Set<String> src, Map<String, Pattern> dest) {
		if (src == null) {
			return;
		}
		for (String reg : src) {
			Pattern pattern = Pattern.compile(toRegex(reg));
			dest.put(reg, pattern);
		}
	}

	/**
	 * 将用户传递的表达式，转换成正则表达式(eg:java.lang.*转换成^java\.lang\..*$)
	 * @param regex
	 * @return
	 */
	private String toRegex(String regex) {
		char[] chars = regex.toCharArray();
		StringBuilder sb = new StringBuilder("^");
		for (int i = 0; i < chars.length; i++) {
			char c = chars[i];
			switch (c) {
			case '.':
			case '$':
			case '(':
			case ')':
				sb.append('\\');
				sb.append(c);
				break;
			case '*':
				sb.append(".*");
				break;
			default:
				sb.append(c);
				break;
			}
		}
		sb.append("$");
		return sb.toString();
	}

	/**
	 * 获取方法签名(eg:java.lang.System.exit(int))
	 * @return
	 */
	private String getSignature(Method m) {
		StringBuilder name = new StringBuilder();
		Class<?> cls = m.getDeclaringClass();
		name.append(cls.getCanonicalName()).append(".");
		name.append(m.getName()).append("(");
		Class<?>[] params = m.getParameterTypes();
		for (int i = 0; i < params.length; i++) {
			Class<?> paramCls = params[i];
			String canonicalName = paramCls.getCanonicalName();
			if (canonicalName.startsWith("java.lang")) {
				canonicalName = canonicalName.substring(canonicalName.lastIndexOf(".") + 1);
			}
			name.append(canonicalName);
			if (i < params.length - 1) {
				name.append(",");
			}
		}
		name.append(")");
		return name.toString();
	}

	private boolean isMatch(Map<String, Pattern> m, String input) {
		for (Map.Entry<String, Pattern> entry : m.entrySet()) {
			if (entry.getValue().matcher(input).find()) {
				return true;
			}
		}
		return false;
	}

	/* 
	 * 
	 *允许通过方法中包含参数方法，则允许访问。
	 *不允许通过方法中包含参数方法，则不允许访问。
	 *如果同时包含，则返回不允许通过方法的测试结果。 
	 * @see com.greenpineyu.fel.security.ReflectMgr#isCallable(java.lang.reflect.Method)
	 */
	
	public boolean isCallable(Method m) {
		String method = getSignature(m);
		if (isMatch(uncallableMap, method)) {
			return false;
		}
		if (callableMap.isEmpty()) {
			return true;
		}
		return isMatch(callableMap, method);
	}

	public static void main(String[] args) {
		// Object eval = Fel.eval("$(System).getProperty('user.home')");
		// System.out.println(eval);

		// 会抛出异常
		Fel.eval("$(System).exit(1)");
	}

}
