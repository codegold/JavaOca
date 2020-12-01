package com.example.InstagramBot;

import com.github.instagram4j.instagram4j.IGClient;
import com.github.instagram4j.instagram4j.exceptions.IGLoginException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InstagramBotApplication {

	public static void main(String[] args) throws IGLoginException {
		SpringApplication.run(InstagramBotApplication.class, args);

        IGClient client = IGClient.builder()
                .username("*")
                .password("*")
                .login();

        System.out.println(client.actions().users()
        .findByUsername("StudyJavaBot"));



	}

}
