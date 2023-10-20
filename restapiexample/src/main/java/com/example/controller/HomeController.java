package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Person2;

import com.example.demo.repository.Person2Repository;

@RestController
public class HomeController {
	@Autowired
	private Person2Repository personRepository;

	@GetMapping("/")
	public String index() {
		return "welcome to Spring boots";
	}

	@PostMapping("/savePerson2")
	public Person2 saveData(@RequestBody Person2 person) {
		personRepository.save(person);
		return person;

	}
}