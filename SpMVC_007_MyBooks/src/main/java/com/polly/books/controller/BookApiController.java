package com.polly.books.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.polly.books.models.BookDto;
import com.polly.books.service.MyBookService;

@Controller
@RequestMapping(value = "/api")
public class BookApiController {

	private final MyBookService myBookService;

	public BookApiController(MyBookService myBookService) {
		this.myBookService = myBookService;
	}

	@RequestMapping(value = { "/list" }, method = RequestMethod.GET)
	public List<BookDto> selectAll() {
		return myBookService.selectAll();
	}
}
