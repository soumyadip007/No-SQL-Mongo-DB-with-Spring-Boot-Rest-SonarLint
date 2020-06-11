package com.spring.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.document.Nest;
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
    
    
    @GetMapping("/update")
    public List<User> getUpdated() {
    	
    	List<User> obj=userRepository.findAll();
    	System.out.println("Before");
        obj.forEach(System.out::println);
        
        
    	obj.get(0).map.put("Key","Value");
    	obj.get(0).map.put("Key-1","Value-1");
    	userRepository.save(obj.get(0));
    	
    	obj=userRepository.findAll();
    	System.out.println("After");
        obj.forEach(System.out::println);
        
        return obj;
    }
    
    
    @GetMapping("/update2")
    public List<User> getUpdated2() {
    	
    	List<User> obj=userRepository.findAll();
    	System.out.println("Before");
        obj.forEach(System.out::println);
       
        
        Nest obj2=new Nest("Updated Java","Top");
    	Nest obj1=new Nest("Updated Python","2nd");
    	List<Nest> o=new ArrayList<>();	
    	o.add(obj2);
    	o.add(obj1);
    	
    	obj.get(1).setList(o);
    	
    	userRepository.save(obj.get(1));
    	
    	obj=userRepository.findAll();
    	System.out.println("After");
        obj.forEach(System.out::println);
        
        return obj;
    }
}
