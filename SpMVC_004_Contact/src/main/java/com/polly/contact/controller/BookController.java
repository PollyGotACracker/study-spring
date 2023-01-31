package com.polly.contact.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.polly.contact.dao.BookDao;
import com.polly.contact.models.Book;

@RestController
@RequestMapping(value="/book")
public class BookController {
	
	@Autowired
	private BookDao bookDao;
	
	@RequestMapping(value= {"/", ""}, produces="application/json;charset=UTF-8")
	public List<Book> list() {
		return bookDao.selectAll();
	}
}
