package com.market.login;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication(scanBasePackages = "com")
@EnableEurekaClient
public class MarketLoginApplication {

	public static void main(String[] args) {
		SpringApplication.run(MarketLoginApplication.class, args);
	}

}
