package com.greenpineyu.fel.security;

import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Set;

public class SecurityMgrImpl implements SecurityMgr {

	private Set<Method> callableSet;
	private Set<Method> uncallableSet;

	{
		callableSet = new HashSet<Method>();
		uncallableSet = new HashSet<Method>();
	}

	/**
	 * 判断原则，以可访问方法列表为首要依据（包含目标方法表示允许访问，否则不允许），不可访问方法列表为次要依据
	 * 当允许访问方法列表为空时，以不可访问方法列表为依据。
	 * 
	 * @see com.greenpineyu.fel.security.ReflectMgr#isCallable(java.lang.reflect.Method)
	 */
	
	public boolean isCallable(Method m) {
		if (callableSet.isEmpty()) {
			return !uncallableSet.contains(m);
		}
		return callableSet.contains(m);
	}
	 /* 

	
	public void addCallable(Method m) {
		this.callableSet.add(m);
	}

	
	public void addUncallable(Method m) {
		this.uncallableSet.add(m);
	}

	
	public void removeCallable(Method m) {
		this.callableSet.remove(m);
	}

	
	public void removeUncallable(Method m) {
		this.uncallableSet.remove(m);

	}

	
	public Set<Method> getCallables() {
		return new HashSet<Method>(this.callableSet);
	}

	
	public Set<Method> getUnCallables() {
		return new HashSet<Method>(this.uncallableSet);
	}

	public static void main(String[] args) {
		Object eval = Fel.eval("$(System).getProperty('user.home')");
		System.out.println(eval);
		// 会抛出异常
		Fel.eval("$(System).exit(1)");
	}*/

}
