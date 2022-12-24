package com.techwork.jsondb;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.techwork.jsondb.domain.Bet;
import com.techwork.jsondb.service.BetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

//MySQL is not working on my laptop. I requested help from senior developers but they could not solve the issue.
//Therefore, I used H2 database for this project.

@SpringBootApplication
public class JsondbApplication {

	public static void main(String[] args) {
		SpringApplication.run(JsondbApplication.class, args);
	}
	@Bean
	CommandLineRunner runner(BetService betService){
		return args -> {

			ObjectMapper mapper = new ObjectMapper();
			TypeReference<List<Bet>> typeReference = new TypeReference<List<Bet>>(){};
			InputStream inputStream = TypeReference.class.getResourceAsStream("/json/bets.json");
			try {
				List<Bet> users = mapper.readValue(inputStream,typeReference);
				betService.save(users);
				System.out.println("Bets Saved!");
			} catch (IOException e){
				System.out.println("Unable to save bets" + e.getMessage());
			}
		};
	}
}
