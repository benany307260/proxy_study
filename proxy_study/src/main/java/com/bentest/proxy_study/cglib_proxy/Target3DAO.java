package com.bentest.proxy_study.cglib_proxy;

/**
 * 
 *
 */
public class Target3DAO {

	public int save() {
		System.out.println("目标对象3保存方法，对象类未实现任何接口，只有一个数据库保存方法");
		return 1;
	}

}
