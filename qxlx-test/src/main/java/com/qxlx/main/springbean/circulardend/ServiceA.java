package com.qxlx.main.springbean.circulardend;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;

/**
 * @author jiabaobao
 * @date 2023/7/30 10:01 AM
 */
@Service
public class ServiceA implements ApplicationContextAware {

	private ApplicationContext applicationContext;

	private ServiceB serviceB;

	public ServiceB getServiceB() {
		return serviceB;
	}

	public void setServiceB(ServiceB serviceB) {
		this.serviceB = serviceB;
	}

	public ApplicationContext getApplicationContext() {
		return applicationContext;
	}

	public ServiceA() {
		System.out.println("serviceA构造成功");
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;
	}
}
