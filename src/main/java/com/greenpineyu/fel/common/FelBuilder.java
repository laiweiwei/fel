package com.greenpineyu.fel.common;

import java.io.File;
import java.util.HashSet;
import java.util.Set;

import com.greenpineyu.fel.security.RegexSecurityMgr;
import com.greenpineyu.fel.security.SecurityMgr;

public class FelBuilder {

	/**
	 * 构建安全管理器
	 * @return
	 */
	public static SecurityMgr newSecurityMgr() {
		Set<String> disables = new HashSet<String>();
		disables.add(System.class.getCanonicalName() + ".*");
		disables.add(Runtime.class.getCanonicalName() + ".*");
		disables.add(Process.class.getCanonicalName() + ".*");
		disables.add(File.class.getCanonicalName() + ".*");
		disables.add("java.net.*");
		disables.add("com.greenpineyu.fel.compile.*");
		disables.add("com.greenpineyu.fel.security.*");
		return new RegexSecurityMgr(null, disables);
	}

	public static void main(String[] args) {
		System.out.println(System.class.getCanonicalName());
	}

}
