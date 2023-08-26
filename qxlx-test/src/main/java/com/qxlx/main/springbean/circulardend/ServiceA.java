package com.qxlx.main.springbean.circulardend;

import org.springframework.stereotype.Service;

/**
 * @author jiabaobao
 * @date 2023/7/30 10:01 AM
 */
@Service
public class ServiceA {
	private ServiceB serviceB;

	public ServiceB getServiceB() {
		return serviceB;
	}

	public void setServiceB(ServiceB serviceB) {
		this.serviceB = serviceB;
	}

	public ServiceA() {
		System.out.println("serviceA构造成功");
	}
}
