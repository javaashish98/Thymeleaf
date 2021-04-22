package com.ashish.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ashish.bo.Person;

public interface PersonAccess extends JpaRepository<Person, Integer> {
		
		

}
