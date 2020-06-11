package com.spring.document;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

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

	public List<Nest> list=new ArrayList<Nest>();

	public User(Integer id, String name, String teamname, List<Nest> list) {
		super();
		this.id = id;
		this.name = name;
		this.teamname = teamname;
		this.list = list;
	}
	
	
	
}
