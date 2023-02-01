package com.polly.contact.service;

import java.util.List;

import com.polly.contact.models.ContactDto;

/*
 * Generic class
 * interface 들의 parents prototype
 * CRUD 를 구현하기 위하여 사용하는 여러 interface 들이 있는데
 * 이러한 interface 들에는 구현되지 않은 prototype 형태의 method 들이
 * 중복되어 정의된다.
 * 일반적으로 기본 CRUD 에는 같은 이름의 method 를 사용한다.
 * 객체지향에서 중복 코드는 최소한으로 유지하는 것이 원칙이다.
 * 이러한 원칙을 지키며 객체지향(특히 자바) 코드의 장점을 활용하는 것
 */

// GenericService -> ContactDao, ContactService -> ContactServiceImplV1
public interface GenericService<DTO, PK> {
	
	public List<DTO> selectAll();
	public ContactDto findById(PK id);
	public int insert(DTO dto);
	public int update(DTO dto);
	public int delete(PK id);
	
}
