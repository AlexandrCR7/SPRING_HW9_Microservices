package ru.gb.ApiGateWay_HW9;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ApiGateWayHw9Application {

	public static void main(String[] args) {
		SpringApplication.run(ApiGateWayHw9Application.class, args);
	}

	@Bean
	public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
		return builder.routes()
				.route("Service1",r->r.path("/service1/**")
						.uri("http://localhost:8081/"))
				.route("Service2",r->r.path("/service1/**")
						.uri("http://localhost:8082/")).build();}

}
