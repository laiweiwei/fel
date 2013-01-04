package com.greenpineyu.fel.security;

import java.lang.reflect.Method;

public interface SecurityMgr {

	/**
	 * 是否允许访问某个方法
	 * @param m
	 * @return
	 */
	boolean isCallable(Method m);



}
