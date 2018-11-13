package com.gaohx.springclouduerekaclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringCloudUerekaClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudUerekaClientApplication.class, args);
	}
}
