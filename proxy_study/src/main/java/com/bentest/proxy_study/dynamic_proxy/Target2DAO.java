package com.bentest.proxy_study.dynamic_proxy;

import com.bentest.proxy_study.service.IDAO;

/**
 * 接口实现
 *
 */
public class Target2DAO implements IDAO {

	public int save() {
		System.out.println("目标对象2保存方法，这里实现了数据库保存");
		return 1;
	}

}
