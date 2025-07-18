package com.nit.sj.cfg;

import java.time.LocalDate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.nit.sj.sbeans")
public class AppConfig {
	
	public AppConfig() {
		System.out.println("AppConfig.AppConfig()");
	}
	
	@Bean(name="ldate")
	public LocalDate createDate() {
		System.out.println("AppConfig.createDate()");
		return LocalDate.now();
	}

}
