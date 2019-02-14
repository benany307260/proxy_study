package com.bentest.proxy_study;

import com.bentest.proxy_study.cglib_proxy.CglibProxyFactory;
import com.bentest.proxy_study.cglib_proxy.Target3DAO;
import com.bentest.proxy_study.dynamic_proxy.ProxyFactory;
import com.bentest.proxy_study.dynamic_proxy.Target2DAO;
import com.bentest.proxy_study.service.IDAO;
import com.bentest.proxy_study.static_proxy.DAOProxy;
import com.bentest.proxy_study.static_proxy.TargetDAO;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // 静态代理测试
    	App.TestStaticProxy();
    	
    	// 动态代理测试
    	App.TestDynamicProxy();
    	
    	// Cglib代理测试
    	App.TestCglibProxy();
    }
    
    /**
     * 静态代理
     */
    public static void TestStaticProxy() {
    	// 目标对象实例
    	IDAO targetDAO = new TargetDAO();
    	
    	// 代理对象实例，并存入目标对象实例
    	IDAO proxy = new DAOProxy(targetDAO);
    	
    	// 通过代理来调用目标对象方法
    	proxy.save();
    }
    
    /**
     * 动态代理
     */
    public static void TestDynamicProxy() {
    	
    	// 目标对象实例
    	IDAO targetDAO = new Target2DAO();
    	
    	// 动态代理工厂类
    	ProxyFactory proxyFactory = new ProxyFactory(targetDAO);
    	
    	// 获取动态代理实例
    	IDAO proxy = (IDAO) proxyFactory.getProxyInstance();
    	
    	// 通过代理来调用目标对象方法
    	proxy.save();
    }
    
    /**
     * Cglib代理
     */
    public static void TestCglibProxy() {
    	
    	// 目标对象实例
    	Target3DAO targetDAO = new Target3DAO();
    	
    	// 代理工厂类
    	CglibProxyFactory proxyFactory = new CglibProxyFactory(targetDAO);
    	
    	// 获取代理实例
    	Target3DAO proxy = (Target3DAO) proxyFactory.getProxyInstance();
    	
    	// 通过代理来调用目标对象方法
    	proxy.save();
    }
    
    
}
