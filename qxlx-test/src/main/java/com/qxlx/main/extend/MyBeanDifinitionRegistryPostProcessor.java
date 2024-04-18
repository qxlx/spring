package com.qxlx.main.extend;

import com.qxlx.main.domain.Person;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;

/**
 * @author qxlx
 * @date 2024/4/8 22:24
 */
public class MyBeanDifinitionRegistryPostProcessor implements BeanDefinitionRegistryPostProcessor {

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println("MyBeanDifinitionRegistryPostProcessor---postProcessBeanFactory");
	}

	@Override
	public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
		System.out.println("MyBeanDifinitionRegistryPostProcessor---postProcessBeanDefinitionRegistry");

		BeanDefinitionBuilder beanDefinitionBuilder = BeanDefinitionBuilder.rootBeanDefinition(MyInvokeBeanDifinitonResgitryPostProcessor.class);
//		beanDefinitionBuilder.addPropertyValue("name","msb");
		registry.registerBeanDefinition("msb",beanDefinitionBuilder.getBeanDefinition());
	}
}
