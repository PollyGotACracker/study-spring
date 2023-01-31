package com.polly.contact.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.polly.contact.models.ContactDto;
import com.polly.contact.persistence.ContactDao;
import com.polly.contact.service.ContactService;

@Service
public class ContactServiceImplV1 implements ContactService{

	@Autowired
	private ContactDao contactDao;
	
	@Override
	public List<ContactDto> selectAll() {
		// TODO Auto-generated method stub
		return contactDao.selectAll();
	}

	@Override
	public ContactDto findByUid(String uid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insert(ContactDto contactDto) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(ContactDto contactDto) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(String uid) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
