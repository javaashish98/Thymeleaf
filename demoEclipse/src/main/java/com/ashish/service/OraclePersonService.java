package com.ashish.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ashish.command.Person;
import com.ashish.dao.PersonAccess;
import com.ashish.dao.PersonInfoProvider;

import java.util.ArrayList;
import java.util.List;

@Service("oraPerSer")
public class OraclePersonService implements PersonService {
	
	@Autowired
	private PersonInfoProvider service;

	
	@Override
	public String register(Person person) {
		
		com.ashish.bo.Person personBo=new com.ashish.bo.Person();
		
		BeanUtils.copyProperties(person,  personBo);
		
		
		int result=service.registerPerson(personBo);
		
		
		
		
		return "Record of the person with person id::"+result+" Has been submitted";
	}

	@Override
	public List<Person> getAllPerson() {
		List<com.ashish.bo.Person> list=service.allPerson();
		List<Person> personList=new ArrayList();
		list.forEach(person->{
			Person p=new Person();
			BeanUtils.copyProperties(person, p);
			personList.add(p);
		});
		
		
		return personList;


	}

}
