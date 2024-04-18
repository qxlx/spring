package com.qxlx.main.extend;

import com.qxlx.main.domain.CreateSupplier;
import com.qxlx.main.domain.User;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.GenericBeanDefinition;

public class UserBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        BeanDefinition user = beanFactory.getBeanDefinition("user");
        GenericBeanDefinition beanDefinition = (GenericBeanDefinition) user;
        beanDefinition.setInstanceSupplier(CreateSupplier::createUser);
        beanDefinition.setBeanClass(User.class);
    }
}