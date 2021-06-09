package com.example.Covid9CasesTracker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class Covid19CasesTrackerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Covid19CasesTrackerApplication.class, args);
	}

}
