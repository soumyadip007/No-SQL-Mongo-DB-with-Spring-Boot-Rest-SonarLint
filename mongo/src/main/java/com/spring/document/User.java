package com.spring.document;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor	
@Document(collection = "User")
public class User {

	@Id
	public Integer id;

	public String name;
	
	public String teamname;

	public List<Nest> list=new ArrayList<>();

	public HashMap<String, String> map=new HashMap<>();
	
	public User(Integer id, String name, String teamname, List<Nest> list) {
		super();
		this.id = id;
		this.name = name;
		this.teamname = teamname;
		this.list = list;
	}
	

	public User(Integer id, String name, String teamname) {
		super();
		this.id = id;
		this.name = name;
		this.teamname = teamname;
	}

	
	
	public User() {
		super();
	}


	public List<Nest> getList() {
		return list;
	}


	public void setList(List<Nest> list) {
		this.list = list;
	}


	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", teamname=" + teamname + ", list=" + list + ", map=" + map + "]";
	}

	
	
//	 @Override
//	  public String toString() {
//	      ObjectMapper mapper = new ObjectMapper();
//	      
//	   String jsonString = "";
//	   
//	   try {
//	      mapper.enable(SerializationFeature.INDENT_OUTPUT);
//	      jsonString = mapper.writeValueAsString(this);
//	    } catch (JsonProcessingException e) {
//	      e.printStackTrace();
//	    }
//	    
//	      return jsonString;
//	    }
	
	
}
