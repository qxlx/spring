package com.qxlx.main.extend;

import org.springframework.beans.factory.FactoryBean;

/**
 * @author qxlx
 * @date 2024/3/24 20:08
 */
public class MyFactoryBean implements FactoryBean<A> {

	@Override
	public A getObject()  {
		System.out.println("MyFactoryBean-调用getObject();");
		return new A();
	}

	@Override
	public Class<?> getObjectType() {
		return A.class;
	}
}

class A {

}
