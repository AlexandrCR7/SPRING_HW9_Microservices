package ru.gb.Eureka_Server_HW9;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerHw9Application {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServerHw9Application.class, args);
	}

}
