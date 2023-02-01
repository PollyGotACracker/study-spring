package com.polly.contact.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.polly.contact.models.ContactDto;
import com.polly.contact.persistence.ContactDao;
import com.polly.contact.service.ContactService;


/**
 * spring project 에서 Bean 에 대하여
 * 
 * spring project 는 project 가 start 될 때
 * @Component(@Controller, @Service, @Bean) 들이 설정된 class 들을
 * scan 하여 객체로 생성한 후 Container 에 보관한다.
 * 
 * 어디선가 @Autowired 로 설정된 코드가 발견되면
 * 해당 객체를 사용할 수 있도록 주입(공급)해준다.
 * 
 * 또는
 * private final 로 설정된 코드가 발견되면
 * 생성자를 통하여 해당 객체를 사용할 수 있도록 주입(공급)해준다.
 * 
 * 1. private final 로 선언된 코드가 있느냐?
 * 		있으면 생성자를 통하여 주입한다.
 * 		없으면 생성자를 통한 주입을 포기한다.
 * 
 * 2. @Autowired 로 선언된 코드가 있냐?
 * 		있으면 (여기서는 service) 객체가 만들어졌느냐?
 * 		그러면 setter 를 통하여 주입한다.
 * 
 * 아래 코드의 생성자에서 cntDao 를 참조하여 method 들을 사용하려면
 * cntDao 도 생성자에서 초기화 되어야 한다.
 */

@Service
public class ContactServiceImplV1 implements ContactService{

	private String[] names;
	private List<ContactDto> contactList;
	// ContactDao 클래스를 사용하여 만든 객체를 사용하려면
	//어디선가 cntDao 에 값을 주입해야 한다.
	private final ContactDao cntDao;

	public ContactServiceImplV1(ContactDao cntDao) {
		super();
		this.cntDao = cntDao;
		cntDao.create_contacts_table();
		cntDao.create_hobbies_table();
		names = new String[]{"홍길동","이몽룡","성춘향","장녹수","임꺽정"};
		contactList = new ArrayList<>();
	}

	@Override
	public List<ContactDto> selectAll() {
		contactList.removeAll(contactList);
		Random rnd = new Random();
		for(int i = 0; i < 10; i++) {
			int rndIndex = rnd.nextInt(names.length);
			ContactDto dto = new ContactDto();
			dto.setC_uid(i+1L);
			dto.setC_name(names[rndIndex]);
			contactList.add(dto);
		}
		// TODO Auto-generated method stub
		return contactList;
	}

	@Override
	public ContactDto findById(Long uid) {
		// TODO Auto-generated method stub
		return contactList.get((int)(long)(uid));
	}

	@Override
	public int insert(ContactDto dto) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(ContactDto dto) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(Long uid) {
		// TODO Auto-generated method stub
		return 0;
	}
	

}
