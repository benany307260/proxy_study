package com.bentest.proxy_study.cglib_proxy;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class CglibProxyFactory implements MethodInterceptor {
	
	// 目标对象
	private Object target;
	
	public CglibProxyFactory(Object target) {
		this.target = target;
	}
	
	/**
	 * 为目标对象创建代理对象
	 * @return
	 */
	public Object getProxyInstance() {
		Enhancer en = new Enhancer();
		// 设置目标的父类
		en.setSuperclass(target.getClass());
		// 设置回调函数
		en.setCallback(this);
		// 创建子类（代理对象实例）
		return en.create();
	}

	@Override
	public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
		
		System.out.println("Cglib代理对象调用前，先打一些日志");
		
		// 执行目录对象方法
		Object returnValue = method.invoke(target, args);
		
		System.out.println("Cglib代理对象调用后，打一下结果："+returnValue);
		return returnValue;
	}

}
