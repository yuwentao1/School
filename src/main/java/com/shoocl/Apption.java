package com.shoocl;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.shoocl")
@MapperScan(basePackages = "com.shoocl.ywt.login.mapper")
public class Apption {

	public static void main(String[] args) {
		SpringApplication.run(Apption.class, args);
	}
}
