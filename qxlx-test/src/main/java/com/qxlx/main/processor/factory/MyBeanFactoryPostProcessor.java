package com.qxlx.main.processor.factory;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

/**
 * @author qxlx
 * @date 2024/3/24 16:58
 */
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		BeanDefinition a = beanFactory.getBeanDefinition("person");
		System.out.println(a.getBeanClassName());
		System.out.println("AbeanPostProcessBean");
	}
}
