package com.bentest.proxy_study.dynamic_proxy;

import java.lang.reflect.Proxy;

/**
 * 动态代理对象
 * @author soap
 *
 */
public class ProxyFactory {
	
	// 目标对象
	private Object target;
	public ProxyFactory(Object target) {
		this.target = target;
	}
	
	/**
	 * 为目标对象生成代理对象
	 * @return
	 */
	public Object getProxyInstance() {
		
		MyInvocationHandler invocationHandler = new MyInvocationHandler(target);
		
		return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), invocationHandler);
	}
}
