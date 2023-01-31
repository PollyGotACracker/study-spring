package com.polly.contact.models;

public class ContactDto {
	private String uid;
	private String name; 
	private String tel;
	private String addr; 
	private String hobby;
	
	
	public ContactDto(String uid, String name, String tel, String addr, String hobby) {
		super();
		this.uid = uid;
		this.name = name;
		this.tel = tel;
		this.addr = addr;
		this.hobby = hobby;
	}
	
	
	public ContactDto() {
		super();
		// TODO Auto-generated constructor stub
	}


	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}


	@Override
	public String toString() {
		return "ContactDto [uid=" + uid + ", name=" + name + ", tel=" + tel + ", addr=" + addr + ", hobby=" + hobby
				+ "]";
	} 
}
