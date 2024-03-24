package com.qxlx.main.factory.factorybean;

import org.springframework.beans.factory.FactoryBean;

/**
 * @author qxlx
 * @date 2024/3/24 20:08
 */
public class AFactoryBean implements FactoryBean<A> {

	@Override
	public A getObject() throws Exception {
		System.out.println("调用getObject();");
		return new A();
	}

	@Override
	public Class<?> getObjectType() {
		return A.class;
	}
}
