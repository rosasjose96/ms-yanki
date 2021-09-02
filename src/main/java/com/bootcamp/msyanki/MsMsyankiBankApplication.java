package com.bootcamp.msyanki;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class MsMsyankiBankApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsMsyankiBankApplication.class, args);
	}

}
