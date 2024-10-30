package com.qxlx.annotation;

import com.qxlx.annotation.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author qxlx
 * @date 2024/7/9 21:49
 */
public class SpringApplication {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ioc =
				new AnnotationConfigApplicationContext(AppConfig.class);
	}

}
