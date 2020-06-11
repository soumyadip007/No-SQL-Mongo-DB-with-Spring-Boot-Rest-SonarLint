package com.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.document.User;
import com.spring.repository.UserRepository;

@RestController
@RequestMapping("/rest/users")
public class Controller {

	@Autowired
    private UserRepository userRepository;

    @GetMapping("/all")
    public List<User> getAll() {
    	List<User> obj=userRepository.findAll();
          
        obj.forEach(System.out::println);
        return obj;
    }
}
