package com.polly.contact.persistence;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;

import com.polly.contact.models.ContactDto;

public interface ContactDao {

	public List<ContactDto> selectAll();
	
	@Select("SELECT * FROM tbl_contact WHERE uid = #{uid}")
	public ContactDto findByUid(String uid);
	
	public int insert(ContactDto contactDto);

	public int update(ContactDto contactDto);
	
	@Delete("DELETE FROM tbl_contact WHERE uid = #{uid}")
	public int delete(String uid);
	
}
