package com.kate.paypalclone.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
//import org.springframework.context.annotation.ComponentScan;

//@ComponentScan(basePackages = "com.kate.paypalclone")
@SpringBootApplication(scanBasePackages={"com.kate.paypalclone.*"})
@EnableJpaRepositories(basePackages = "com.kate.paypalclone.repository")
@EntityScan("com.kate.paypalclone.*")
public class PaypalcloneApplication {

	public static void main(String[] args) {
		SpringApplication.run(PaypalcloneApplication.class, args);
	}

}
