package com.nearsoft.sktserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SktServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SktServerApplication.class, args);
	}
}
