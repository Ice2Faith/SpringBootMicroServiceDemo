package com.market.lombok;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication(scanBasePackages = "com")
@EnableEurekaClient
public class MarketLombokApplication {

	public static void main(String[] args) {
		SpringApplication.run(MarketLombokApplication.class, args);
	}

}
