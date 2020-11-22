package com.market.admin.login;

import com.market.admin.login.feign.LoginFeign;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication(scanBasePackages = "com")
@EnableEurekaClient
@EnableFeignClients(clients = {LoginFeign.class})
public class MarketAdminLoginApplication {

	public static void main(String[] args) {
		SpringApplication.run(MarketAdminLoginApplication.class, args);
	}

}
