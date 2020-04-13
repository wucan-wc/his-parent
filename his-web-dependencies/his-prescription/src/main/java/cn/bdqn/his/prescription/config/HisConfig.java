package cn.bdqn.his.prescription.config;

import javax.servlet.http.HttpServletRequest;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import cn.bdqn.his.common.http.HttpClientHelper;

@Configuration
public class HisConfig {
	@Bean
	HttpClientHelper httpClientHelper(HttpServletRequest request) {
		return new HttpClientHelper(request);
	}
}
