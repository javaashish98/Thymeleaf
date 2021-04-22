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
		
		
		System.out.println(person);
		
		
		
		return "Your Data is put on Oracle Database";
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
