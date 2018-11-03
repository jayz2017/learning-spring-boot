package com.greglturnquist.learningspringboot.repository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.greglturnquist.learningspringboot.dao.Charty;

import reactor.core.publisher.Flux;

@Configuration
public class LoadDatebase {

	CommandLineRunner init(ChartyRepository repository) {
		return args -> {
			Flux.just(new Charty("Quick Start the java"), new Charty("Reactive Web the Spring boot"),
					new Charty(".........more that")).flatMap(repository::save).subscribe(System.out::print);
		};

	}

}
