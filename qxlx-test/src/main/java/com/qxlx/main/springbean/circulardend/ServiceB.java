package com.qxlx.main.springbean.circulardend;

import org.springframework.stereotype.Service;

/**
 * @author jiabaobao
 * @date 2023/7/30 10:10 AM
 */
@Service
public class ServiceB {

	private ServiceA serviceA;

	public ServiceA getServiceA() {
		return serviceA;
	}

	public void setServiceA(ServiceA serviceA) {
		this.serviceA = serviceA;
	}

	public ServiceB() {
		System.out.println("serviceB构造成功");
	}
}
