package com.market.mybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication(scanBasePackages = "com")
@EnableEurekaClient
@MapperScan("com.market.dao")
@EnableTransactionManagement
public class MarketMybatisApplication {

	public static void main(String[] args) {
		SpringApplication.run(MarketMybatisApplication.class, args);
	}

}
