package com.emily.timestables;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TimestablesApplication {

	public static void main(String[] args) {
		SpringApplication.run(TimestablesApplication.class, args);
		TimestablesConsole console = new TimestablesConsole();
		console.startConsole();
	}

}
