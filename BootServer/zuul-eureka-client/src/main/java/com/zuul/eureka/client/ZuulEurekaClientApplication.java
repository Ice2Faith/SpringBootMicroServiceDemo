package com.zuul.eureka.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
@EnableEurekaClient
public class ZuulEurekaClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZuulEurekaClientApplication.class, args);
	}

}
