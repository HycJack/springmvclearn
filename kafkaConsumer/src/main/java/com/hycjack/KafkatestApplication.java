package com.hycjack;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class KafkatestApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkatestApplication.class, args);
	}
}
