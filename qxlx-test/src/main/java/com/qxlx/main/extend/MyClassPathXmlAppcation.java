package com.qxlx.main.extend;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author qxlx
 * @date 2024/4/3 22:05
 */
public class MyClassPathXmlAppcation extends ClassPathXmlApplicationContext {

	public MyClassPathXmlAppcation(String configLocation) throws BeansException {
		super(configLocation);
	}

	@Override
	protected void initPropertySources() {
		System.out.println("拓展init proertpsource");
		getEnvironment().setRequiredProperties("abc");
	}

	@Override
	protected void customizeBeanFactory(DefaultListableBeanFactory beanFactory) {
		super.customizeBeanFactory(beanFactory);
	}

	@Override
	protected void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) {
		// beanFactory 进行处理
	}
}
