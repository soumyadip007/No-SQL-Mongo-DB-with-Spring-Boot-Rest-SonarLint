package com.spring.document;

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

public class Nest {


	private String name;
	
	private String pos;

	public Nest(String name, String pos) {
		super();
		this.name = name;
		this.pos = pos;
	}

	
	
}
