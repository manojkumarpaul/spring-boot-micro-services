package com.spring.boot.microservice.movie.catalog.moviecatalogservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class MovieCatalogServiceApplication {

	private RestTemplate restTemplate;
	@Bean
	public RestTemplate getRestTemplate(){
		return new RestTemplate();
	}
	public static void main(String[] args) {
		SpringApplication.run(MovieCatalogServiceApplication.class, args);
	}

}
