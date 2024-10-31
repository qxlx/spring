package com.qxlx.ss;


import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author qxlx
 * @date 2024/10/30 22:02
 */
public class Test02 {

	public static void main(String[] args) {
		// IOC核心流程
		// 1,如何读取配置文件,获取IO文件
		// 2,加载文件后 如何以对象的形式封装
		// 3.根据配置信息创建对象
		// 4.所创建对象的生命周期

		ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("beans.xml");
		Object bean = classPathXmlApplicationContext.getBean("");
		System.out.println(bean);
	}

}
