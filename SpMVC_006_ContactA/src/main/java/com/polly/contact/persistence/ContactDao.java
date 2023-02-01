package com.polly.contact.persistence;

import com.polly.contact.models.ContactDto;
import com.polly.contact.service.GenericService;

public interface ContactDao extends GenericService<ContactDto, Long>{
	
	// 프로젝트가 시작될 때 table 을 자동 생성하기 위한 method 정의
	public void create_contacts_table();
	public void create_hobbies_table();

}
