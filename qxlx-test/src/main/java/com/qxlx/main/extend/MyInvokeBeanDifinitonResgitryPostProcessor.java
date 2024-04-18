package com.qxlx.main.extend;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;

/**
 * @author qxlx
 * @date 2024/4/8 22:40
 */
public class MyInvokeBeanDifinitonResgitryPostProcessor implements BeanDefinitionRegistryPostProcessor {


	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println("MyInvokeBeanDifinitonResgitryPostProcessor-postProcessBeanFactory");
	}

	@Override
	public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
		System.out.println("MyInvokeBeanDifinitonResgitryPostProcessor-postProcessBeanDefinitionRegistry");
	}
}
