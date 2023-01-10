package com.polly.user.service;

import org.springframework.stereotype.Service;

import com.polly.user.models.BookVO;


/**
 * Controller 와 DB 중간에서
 * Business Logic 을 설계하는 모듈 
 *
 * @Service Annotation
 * BookService Container 생성
 * 요청이 오면 바로 응답하므로 인스턴스 생성 필요 X
 * 메모리 절약 가능
 */
@Service
public class BookService {
	public BookVO getBook() {
		BookVO book = new BookVO();
		book.setIsbn("9700001");
		book.setTitle("NodeJS 교과서");
		book.setComp("길벗");
		book.setAuthor("조현영");
		book.setPrice(30000);
		return book;
	}
}
