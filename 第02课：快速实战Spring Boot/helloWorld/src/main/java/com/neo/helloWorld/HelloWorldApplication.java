package com.neo.helloWorld;

import com.alibaba.fastjson.parser.Feature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import java.util.List;

@SpringBootApplication
public class HelloWorldApplication extends WebMvcConfigurationSupport {
	@Override
	protected void configureMessageConverters(List<HttpMessageConverter<?>> converters){
		super.configureMessageConverters(converters);
		FastJsonHttpMessageConverter fastJsonHttpMessageConverter=new FastJsonHttpMessageConverter();
		FastJsonConfig fastJsonConfig=new FastJsonConfig();
		fastJsonConfig.setFeatures(Feature.SupportArrayToBean);
		fastJsonHttpMessageConverter.setFastJsonConfig(fastJsonConfig);
		converters.add(fastJsonHttpMessageConverter);
	}
	public static void main(String[] args) {
		SpringApplication.run(HelloWorldApplication.class, args);
	}
}
