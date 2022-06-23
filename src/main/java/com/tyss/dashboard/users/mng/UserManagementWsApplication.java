package com.tyss.dashboard.users.mng;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@ComponentScan(basePackages = "com.tyss.dashboard.users")
@EnableMongoRepositories
@EnableDiscoveryClient
@EnableFeignClients
public class UserManagementWsApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserManagementWsApplication.class, args);
	}

}
