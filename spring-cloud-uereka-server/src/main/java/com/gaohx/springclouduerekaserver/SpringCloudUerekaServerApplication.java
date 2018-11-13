package com.gaohx.springclouduerekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringCloudUerekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudUerekaServerApplication.class, args);
	}
}
