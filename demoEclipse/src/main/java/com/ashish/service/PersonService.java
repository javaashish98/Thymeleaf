package com.ashish.service;

import com.ashish.command.Person;

import java.util.List;

public interface PersonService {
	
	public String register(Person person);
	public List<Person> getAllPerson();



}
