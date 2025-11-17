package com.github.lisafelixs.bfb_ms_technical;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableCaching
@EnableAsync
public class BfbMsTechnicalApplication {

	public static void main(String[] args) {
		SpringApplication.run(BfbMsTechnicalApplication.class, args);
	}

}
