package com.polly.contact.service;

import java.util.List;

import com.polly.contact.models.AddrVO;

/*
 * interface
 * Java Source Code 또다른 class
 * 모양만 있는 클래스
 * 
 * 1. 클래스를 만들기 위한 prototype 선언
 * 2. method 를 정의하고 모양(argument type, return type)을 구축한다.
 * 3. 구체적인 method 의 코드가 없다. 코드블럭( {} ) 도 없다.
 * 4. 클래스를 만들 때 implement 하여 사용하는 부모 class 이다.
 * 5. 이 클래스를 객체로 만들 때(인스턴스 생성)는 구현체 클래스가 있어야 한다.
 * 
 * AddrServiceImpl... class 들이 
 * 해당 interface 를 상속받음
 * 
 * 추상클래스 vs 인터페이스(클래스)
 * 추상클래스는 메소드의 기능을 상속 및 확장 목적, 생성자 O, 다중상속 불가
 * 인터페이스는 메소드의 구현 강제, 생성자 X, 다중상속 가능
 */

public interface AddrService {
	// 모든 데이터를 select 하여 List 형의 AddrVO 로 return
	public List<AddrVO> selectAll();
	// String 형의 num 을 인수로 받아 select 한 결과를 AddrVO 로 return 
	public AddrVO findById(String num);
	// AddrVO 를 인수로 받아 정수를 return 하는 나머지 methods 
	public int insert(AddrVO addrVO);
	public int update(AddrVO addrVO);
	public int delete(String num);
}
