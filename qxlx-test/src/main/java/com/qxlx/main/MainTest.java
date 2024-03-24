package com.qxlx.main;

import com.qxlx.main.domain.Person;
import com.qxlx.main.factory.factorybean.A;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author jiabaobao
 * @date 2023/7/19 8:55 AM
 */
public class MainTest {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("beans.xml");
		Person person = classPathXmlApplicationContext.getBean(Person.class);
		System.out.println("person:"+person);

		A a = (A) classPathXmlApplicationContext.getBean("aFactoryBean");
		System.out.println("a:"+a);
//		ServiceA beanServiceA = classPathXmlApplicationContext.getBean(ServiceA.class);
//		ServiceB beanServiceB = classPathXmlApplicationContext.getBean(ServiceB.class);
//
//		System.out.println("beanA:"+beanServiceA);
//		System.out.println("beanB:"+beanServiceB);
//		System.out.println("appliaction:"+beanServiceA.getApplicationContext());

	}

}
