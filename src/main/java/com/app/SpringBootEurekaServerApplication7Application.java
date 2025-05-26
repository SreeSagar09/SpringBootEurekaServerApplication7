package com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SpringBootEurekaServerApplication7Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootEurekaServerApplication7Application.class, args);
		System.out.println("SpringBootEurekaServerApplication7Application is started..");
	}

}
