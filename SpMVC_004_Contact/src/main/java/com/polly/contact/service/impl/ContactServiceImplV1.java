package com.polly.contact.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Service;

import com.polly.contact.models.Contact;
import com.polly.contact.service.ContactService;

@Service
public class ContactServiceImplV1 implements ContactService {

	/**
	 * 클래스 인스턴스 변수 초기화하기
	 * 인스턴스 변수는 기본 생성자에서 보통 기본값으로 초기화가 된다.
	 * (null 또는 0 등)
	 * 
	 * 기본값이 null 로 선언된 객체를 통하여
	 * 무언가 실행을 하려고 하면 Null Pointer Exception 이 주로 발생한다.
	 * 
	 * Null Pointer Exception 문제는 오래 전부터 Java 개발자를 매우 괴롭혔다.
	 * 
	 */
	
	//	private Random rnd = new Random();  이렇게 하면 안된다.
	// 이렇게 선언만 하고 아래 생성자에서 초기화해야 한다.
	private Random rnd;
	//	private String[] names = new String[] {
	//			"홍길동","이몽룡","성춘향","임꺽정","장보고"
	//		};
	private String[] names;
	
	// 기본 생성자에서 names 인스턴스 배열을
	// 5 개의 이름이 담긴 문자열 배열로 만들기
	public ContactServiceImplV1() {
		this.names = new String[] {
			"홍길동","이몽룡","성춘향","임꺽정","장보고"
		};
		this.rnd = new Random();
	}

	@Override
	public List<Contact> selectAll() {
		List<Contact> contactList = new ArrayList<>();
		for(int i = 0; i < 10; i++) {
			
			Contact con = new Contact();
			// S%03d: 문자 S와 3자리 빈 칸에 정수가 들어가고 남은 자리는 0으로 채움(S001, S002...)
			String strId = String.format("S%03d", i + 1);
			con.setC_id(strId);
			
			int num = rnd.nextInt(5); // 0~n 미만의 정수형 난수 반환
			con.setC_name(names[num]);
			contactList.add(con);
		}
		// TODO Auto-generated method stub
		return contactList;
	}

	@Override
	public Contact findById(String id) {
		
		/**
		 * Contact 클래스를 사용하여
		 * Contact 정보를 저장할 myContact 객체 선언
		 * 생성자 new Contact() 를 사용하여
		 * myContact 객체를 생성 => 인스턴스화
		 * 
		 * 이때 Contact 에 선언된 변수들은 모두 초기화 된다.
		 */
		Contact myContact = new Contact("S0001","홍길동","polly@gmail.com",33);
		System.out.println(myContact.toString());
		Contact myCA = new Contact("A0001","이몽룡",20);
		Contact myCB = new Contact("F0001","성춘향",16);
		
		// 기본 생성자를 사용하여 모든 인스턴스 변수를
		// 기본값(String = null, int = 0 등)으로 하는
		// 객체 생성 방법	
		Contact myBlank = new Contact();
		myBlank.setC_name("장보고");
		myBlank.setC_id("B0001");
		
		return myContact;
	}

	@Override
	public int insert(Contact contact) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Contact contact) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(String id) {
		// TODO Auto-generated method stub
		return 0;
	}

}
