package com.zmx.action;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@EnableAutoConfiguration
// 激活自动扫描配置
@ComponentScan("com.zmx")
// 扫描注解
@EntityScan("com.zmx.domain")
// 扫描实体文件
@EnableJpaRepositories("com.zmx.dao")
// 扫描dao的配置
@PropertySource(value = "classpath:application.properties")
public class App {
	
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
}





















