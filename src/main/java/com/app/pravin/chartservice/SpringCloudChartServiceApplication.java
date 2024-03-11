package com.app.pravin.chartservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient

public class SpringCloudChartServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudChartServiceApplication.class, args);
	}

}
