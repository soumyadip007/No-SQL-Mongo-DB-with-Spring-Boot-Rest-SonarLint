package com.spring.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.spring.document.User;

public interface UserRepository extends MongoRepository<User,Integer>{

}
