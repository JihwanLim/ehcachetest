package com.example.ehcachetest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication
public class EhcachetestApplication {

	public static void main(String[] args) {
		SpringApplication.run(EhcachetestApplication.class, args);
	}

}
