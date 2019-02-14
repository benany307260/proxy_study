package com.bentest.proxy_study.static_proxy;

import com.bentest.proxy_study.service.IDAO;

/**
 * 代理对象，静态代理
 *
 */
public class DAOProxy implements IDAO {

	private IDAO target;
	
	public DAOProxy(IDAO target) {
		this.target = target;
	}
	
	public int save() {
		System.out.println("代理对象调用前，先打一些日志");
		
		// 执行目录对象方法
		int result = target.save();
		
		System.out.println("代理对象调用后，打一下结果："+result);
		
		return result;
	}

}
