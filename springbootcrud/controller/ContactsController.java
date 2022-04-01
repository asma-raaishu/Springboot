package com.java.springbootcrudapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.java.springbootcrudapp.bean.Contacts;
import com.java.springbootcrudapp.service.ContactsService;

@RestController
public class ContactsController {
	@Autowired
	private ContactsService cs;
	@RequestMapping("/contact")
	public List<Contacts> getAllContacts()
	{
		return cs.getAllContacts();
		
	}
	@RequestMapping(method=RequestMethod.POST,value="/contact")
	public void createContacts(@RequestBody Contacts c)
	{
		cs.createContact(c);
	}
	@RequestMapping(method=RequestMethod.PUT,value="/contact/{c_id}")
	public void updateContacts(@PathVariable int c_id,@RequestBody Contacts c)
	{
		cs.updateContact(c_id,c);
	}
	@RequestMapping(method=RequestMethod.DELETE,value="/contact{c_id}")
	public void deleteContacts(@PathVariable int c_id)
	{
		cs.deleteContact(c_id);
	}
	

}

