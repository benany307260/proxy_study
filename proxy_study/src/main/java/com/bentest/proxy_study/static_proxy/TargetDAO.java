package com.bentest.proxy_study.static_proxy;

import com.bentest.proxy_study.service.IDAO;

/**
 * 接口实现
 *
 */
public class TargetDAO implements IDAO {

	public int save() {
		System.out.println("目标对象保存方法，这里实现了数据库保存");
		return 1;
	}

}
