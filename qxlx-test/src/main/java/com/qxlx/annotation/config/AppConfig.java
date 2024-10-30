package com.qxlx.annotation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author qxlx
 * @date 2024/7/9 21:49
 */
@Configuration
public class AppConfig {

	@Bean
	AppBean appBean() {
		return new AppBean();
	}

	public static class AppBean {

	}

}
