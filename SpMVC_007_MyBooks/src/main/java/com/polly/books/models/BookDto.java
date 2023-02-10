package com.polly.books.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Builder
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class BookDto {
	private String	title;
	private String	link;	
	private String	image;	
	private String	author;	
	private int	discount;	
	private String	publisher;	
	private String	isbn;	
	private String	description;	
	private String	pubdate;
	private int price;
}
