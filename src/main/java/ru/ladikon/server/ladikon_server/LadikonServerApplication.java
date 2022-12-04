package ru.ladikon.server.ladikon_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

@ComponentScan
@EnableAutoConfiguration
@SpringBootApplication
public class LadikonServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(LadikonServerApplication.class, args);
	}

}
