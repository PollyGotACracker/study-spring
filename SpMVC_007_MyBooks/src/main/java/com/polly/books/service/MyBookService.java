package com.polly.books.service;

import java.util.List;

import com.polly.books.models.BookDto;
import com.polly.books.persistence.GenericDao;

public interface MyBookService extends GenericDao<BookDto, String> {
	public List<BookDto> findByBookTitle(String title);
	public List<BookDto> findByAuthor(String author);
	public List<BookDto> findByPublisher(String publisher);
}
