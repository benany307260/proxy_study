package com.bentest.proxy_study.dynamic_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 动态代理方法实现类
 *
 */
public class MyInvocationHandler implements InvocationHandler {

	// 目标对象
	private Object target;
	public MyInvocationHandler(Object target) {
		this.target = target;
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		
		System.out.println("动态代理对象调用前，先打一些日志");
		
		// 执行目录对象方法
		Object returnValue = method.invoke(target, args);
		
		System.out.println("动态代理对象调用后，打一下结果："+returnValue);
		return returnValue;
	}

}
