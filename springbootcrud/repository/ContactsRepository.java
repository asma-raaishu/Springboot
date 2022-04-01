package com.java.springbootcrudapp.repository;

import org.springframework.data.repository.CrudRepository;

import com.java.springbootcrudapp.bean.Contacts;

public interface ContactsRepository extends CrudRepository<Contacts,Integer> {

	
}

