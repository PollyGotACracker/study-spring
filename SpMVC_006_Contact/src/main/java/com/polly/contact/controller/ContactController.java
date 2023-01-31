package com.polly.contact.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.polly.contact.models.ContactDto;
import com.polly.contact.service.ContactService;

@RestController
@RequestMapping(value="/addr")
public class ContactController {
	
	@Autowired
	private ContactService contactService;
	
	@RequestMapping(value={"","/"})
	public List<ContactDto> selectAll() {
			return contactService.selectAll();
	}
}
