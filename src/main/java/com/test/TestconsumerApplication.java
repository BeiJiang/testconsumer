package com.test;

import io.dubbo.springboot.DubboAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@EnableAutoConfiguration(exclude = {DubboAutoConfiguration.class})
@ImportResource("classpath:dubbo-consumer.xml")
@ComponentScan(basePackages = {"com.test.dubbo","com.test.web"})
@ServletComponentScan
public class TestconsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestconsumerApplication.class, args);
	}
}
