package com.polly.books.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.polly.books.models.BookDto;
import com.polly.books.persistence.BookDao;
import com.polly.books.service.MyBookService;

@Service
public class MyBookServiceimplV1 implements MyBookService {

	protected final BookDao bookDao;
	
	public MyBookServiceimplV1(BookDao bookDao) {
		this.bookDao = bookDao;
	}
	
	
	@Override
	public List<BookDto> selectAll() {
		// TODO Auto-generated method stub
		return bookDao.selectAll();
	}

	@Override
	public BookDto findByID(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insert(BookDto id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(BookDto vo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(String id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<BookDto> findByBookTitle(String title) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BookDto> findByAuthor(String author) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BookDto> findByPublisher(String publisher) {
		// TODO Auto-generated method stub
		return null;
	}

}
