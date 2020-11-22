package com.market.redis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication(scanBasePackages = "com")
@EnableEurekaClient
public class MarketRedisApplication {

	public static void main(String[] args) {
		SpringApplication.run(MarketRedisApplication.class, args);
	}

}
