package com.ph.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ConfigclientApplication {
	public static void main(String[] args) {
		SpringApplication.run(ConfigclientApplication.class, args);
	}
}
