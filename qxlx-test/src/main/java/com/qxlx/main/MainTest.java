package com.qxlx.main;

import com.qxlx.main.springbean.circulardend.ServiceA;
import com.qxlx.main.springbean.circulardend.ServiceB;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author jiabaobao
 * @date 2023/7/19 8:55 AM
 */
public class MainTest {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("beans.xml");
		ServiceA beanServiceA = classPathXmlApplicationContext.getBean(ServiceA.class);
		ServiceB beanServiceB = classPathXmlApplicationContext.getBean(ServiceB.class);

		System.out.println("beanA:"+beanServiceA);
		System.out.println("beanB:"+beanServiceB);
	}

}
