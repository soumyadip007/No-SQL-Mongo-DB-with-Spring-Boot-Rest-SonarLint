package com.spring.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.spring.document.User;
import com.spring.repository.UserRepository;

@EnableMongoRepositories(basePackageClasses = UserRepository.class)
@Configuration
public class MongoDBConfig {

	
	@Bean
	CommandLineRunner commandLineRunner(UserRepository userRepository) {
	return string->{
		userRepository.save(new User(1,"Soumya","Dip"));
		userRepository.save(new User(2,"Soumya","Dip"));
	};
	}
}
