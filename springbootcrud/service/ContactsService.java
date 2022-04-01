package com.java.springbootcrudapp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.springbootcrudapp.bean.Contacts;
import com.java.springbootcrudapp.repository.ContactsRepository;

@Service
public class ContactsService {
	@Autowired
	public ContactsRepository cr;

	public List<Contacts> getAllContacts() {
		List<Contacts> c=new ArrayList<>();
		cr.findAll().forEach(c::add);		
		return c;
	}
	public void createContact(Contacts c) {
		cr.save(c);		
	}
	public void updateContact(int id,Contacts c)
	{
		cr.save(c);
	
	}
	public void deleteContact(int id)
	{
		
		cr.deleteById(id);
	}

}
