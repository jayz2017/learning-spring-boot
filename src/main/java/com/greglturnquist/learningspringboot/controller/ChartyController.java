package com.greglturnquist.learningspringboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.greglturnquist.learningspringboot.dao.Charty;
import com.greglturnquist.learningspringboot.repository.ChartyRepository;

import reactor.core.publisher.Flux;

@RestController("charty")
public class ChartyController {
	private final ChartyRepository Repository;

	public ChartyController(ChartyRepository Repository) {
		this.Repository = Repository;
	}

	@RequestMapping(value = "list", method = RequestMethod.GET)
	public Flux<Charty> list() {
		return Repository.findAll();
	}
}
