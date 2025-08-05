package com.deveops;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DevopsDemoApplication {

	@GetMapping
	public String message(){
		return "welcome to javatechie";
	}

	public static void main(String[] args) {
		SpringApplication.run(DevopsDemoApplication.class, args);
	}

}
