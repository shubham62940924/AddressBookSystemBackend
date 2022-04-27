package com.blz.addressbook;


import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Slf4j
@SpringBootApplication
public class AddressbooksysytemApplication {

	@Bean
	public BCryptPasswordEncoder passwordEncoder() {

		return new BCryptPasswordEncoder();
	}

	public static void main(String[] args) {
		SpringApplication.run(AddressbooksysytemApplication.class, args);
		log.info("Welcome to AddressBook");
	}



	}








