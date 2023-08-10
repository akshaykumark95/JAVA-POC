package com.example.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyRouteConfig {
	
	@Bean
	public RouteLocator configureRoutes(RouteLocatorBuilder locatorBuilder) {
		return locatorBuilder.routes()
				.route("property-details", r->r.path("/property/details/**").uri("lb://PROPERTY-DETAILS-SERVICE"))
				.route("search-property-details",r->r.path("/search/property/**").uri("lb://PROPERTY-SEARCH-SERVICE"))
				.build();
	}
}
