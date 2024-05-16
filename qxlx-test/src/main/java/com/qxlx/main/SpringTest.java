package com.qxlx.main;

import com.qxlx.main.domain.Person;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 *  https://www.cnblogs.com/java-chen-hao/category/1480619.html 文章推荐阅读
 *
 * @author jiabaobao
 * @date 2023/7/19 8:55 AM
 */
public class SpringTest {

	public static void main(String[] args) {
//		MyClassPathXmlAppcation myClassPathXmlAppcation = new MyClassPathXmlAppcation("beans.xml");

		ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("beans.xml");
//		ServiceA beanServiceA = classPathXmlApplicationContext.getBean(ServiceA.class);
//		ServiceB beanServiceB = classPathXmlApplicationContext.getBean(ServiceB.class);
//
//		System.out.println("beanA:" + beanServiceA);
//		System.out.println("beanB:" + beanServiceB);

		Person se = classPathXmlApplicationContext.getBean(Person.class);
		se.test();
		System.out.println(se);

//		MyFactoryBean myFactoryBean = (MyFactoryBean) classPathXmlApplicationContext.getBean("&myFactoryBean");
//		System.out.println(myFactoryBean);
//		Object user = classPathXmlApplicationContext.getBean("myFactoryBean");
//		System.out.println(user);

		//Object object = myFactoryBean.getObject();
		//System.out.println(object);

//		Person person = classPathXmlApplicationContext.getBean(Person.class);
//		System.out.println("person:"+person);

//		A a = (A) classPathXmlApplicationContext.getBean("aFactoryBean");
//		System.out.println("a:"+a);
//		ServiceA beanServiceA = classPathXmlApplicationContext.getBean(ServiceA.class);
//		ServiceB beanServiceB = classPathXmlApplicationContext.getBean(ServiceB.class);
//
//		System.out.println("beanA:"+beanServiceA);
//		System.out.println("beanB:"+beanServiceB);
//		System.out.println("appliaction:"+beanServiceA.getApplicationContext());

	}

}
