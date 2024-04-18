package com.qxlx.main.extend;

import com.qxlx.main.domain.BeforeInstantiation;
import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.cglib.proxy.Enhancer;

public class MyInstantiationAwareBeanPostProcessor  implements InstantiationAwareBeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.print("beanName:"+beanName+"执行..postProcessBeforeInitialization\n");

        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.print("beanName:"+beanName+"执行..postProcessAfterInitialization\n");

        return bean;
    }

    @Override
    public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
        System.out.print("beanName:"+beanName+"执行..postProcessAfterInstantiation\n");

        return false;
    }

    @Override
    public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
        System.out.print("beanName:"+beanName+"执行..postProcessBeforeInstantiation\n");
        //利用 其 生成动态代理
        if(beanClass== BeforeInstantiation.class){
            Enhancer enhancer = new Enhancer();
            enhancer.setSuperclass(beanClass);
            enhancer.setCallback(new MyMethodInterceptor());
            BeforeInstantiation beforeInstantiation = (BeforeInstantiation)enhancer.create();
            System.out.print("返回动态代理\n");
            return beforeInstantiation;
        }
        return null;
    }

    @Override
    public PropertyValues postProcessProperties(PropertyValues pvs, Object bean, String beanName) throws BeansException {
        System.out.print("beanName:"+beanName+"执行..postProcessProperties\n");
        return pvs;
    }
}