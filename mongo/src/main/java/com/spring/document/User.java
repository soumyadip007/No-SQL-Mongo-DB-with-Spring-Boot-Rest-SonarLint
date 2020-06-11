package com.spring.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class User {

	@Id
	public Integer id;

	public String name;
	
	public String teamname;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTeamname() {
		return teamname;
	}

	public void setTeamname(String teamname) {
		this.teamname = teamname;
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
	
}
