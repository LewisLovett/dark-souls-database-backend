package com.nology.darksoulsdatabase;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class DarkSoulsDatabaseApplication {

	public static void main(String[] args) {
		SpringApplication.run(DarkSoulsDatabaseApplication.class, args);
	}

}
