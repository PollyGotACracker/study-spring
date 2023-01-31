package com.polly.contact.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.polly.contact.models.BookDto;
import com.polly.contact.service.BookService;

@RestController
@RequestMapping(value="/book")
public class BookController {
	
	@Autowired
	private BookService bookService;
	
	// controller 는 최소한의 역할만을 하고 service 가 대부분의 연산을 수행해야 한다.
	// 그렇지 않을 경우 속도가 매우 느려지게 된다.
	@RequestMapping(value={"","/"})
	public List<BookDto> selectAll() {
		return bookService.selectAll();
	}

}
