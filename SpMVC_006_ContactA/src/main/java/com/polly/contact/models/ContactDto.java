package com.polly.contact.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class ContactDto {
	
	// name 같은 변수는 keyword 로 쓰일 수 있으므로 prefix 를 붙이는 것이 좋다.
	private Long c_uid;
	private String c_email;
	private String c_name; 
	private String c_tel;
	private String c_addr; 
	private String c_hobby;
}
