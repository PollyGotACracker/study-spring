package com.polly.books.persistence;

import java.util.List;

public interface GenericDao<VO, PK> {
	
	public List<VO> selectAll();
	public VO findByID(PK id);
	public int insert(VO id);
	public int update(VO vo);
	public int delete(PK id);
	
}
