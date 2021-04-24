package com.ashish.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ashish.bo.Person;

@Repository
public class PersonInfoProvider {
	
	@Autowired
	private PersonAccess dao;
	
	public List<Person> allPerson(){
	   List<Person> listPerson=dao.findAll();
	  
		   return listPerson;
		   
	}
	
	
	public int registerPerson(Person person) {
		Person p=dao.save(person);
		return p.getPid();
	}
}
