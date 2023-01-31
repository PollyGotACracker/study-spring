package com.polly.contact.service;

import java.util.List;

import com.polly.contact.models.ContactDto;

public interface ContactService {
	public List<ContactDto> selectAll();
	public ContactDto findByUid(String uid);
	public int insert(ContactDto contactDto);
	public int update(ContactDto contactDto);
	public int delete(String uid);
}
