package com.kate.paypalclone.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.kate.paypalclone")
@SpringBootApplication
@EntityScan("com.kate.paypalclone.*")
public class PaypalcloneApplication {

	public static void main(String[] args) {
		SpringApplication.run(PaypalcloneApplication.class, args);
	}

}
