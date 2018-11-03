package com.greglturnquist.learningspringboot.dao;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

/**
 * @author jekk
 *
 */
@Data
@Document
public class Charty {
	@Id
	private String id;
	private String name;

	public Charty(String name) {
		this.name = name;
	}

}
