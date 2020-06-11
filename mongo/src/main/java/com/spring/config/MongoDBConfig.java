package com.spring.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.spring.document.Nest;
import com.spring.document.User;
import com.spring.repository.UserRepository;

@EnableMongoRepositories(basePackageClasses = UserRepository.class)
@Configuration
public class MongoDBConfig {

	
	@Bean
	CommandLineRunner commandLineRunner(UserRepository userRepository) {
		
	Nest obj=new Nest("Java","Top");
	Nest obj1=new Nest("Python","2nd");
	List<Nest> o=new ArrayList<>();	
	o.add(obj);
	o.add(obj1);
	
	User user1=new User(1,"Soumya","Dip",o);
	User user2=new User(2,"Soumya","Dip Chowdhury",o);
		
	return string->{
		userRepository.save(user1);
		userRepository.save(user2);
	};
	}
}
