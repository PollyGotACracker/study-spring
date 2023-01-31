package com.polly.contact.models;

/**
 * BookDto
 * 
 * DTO(Data Transfer Object)
 * 	데이터를 담아서 여기저기로 옮기는 바구니 역할을 하는 객체
 * 
 * VO(Value Object)
 *	데이터를 담는 객체 
 */

public class BookDto {
	private String title;
	private String link;
	private String image;
	private String author;
	private int discount;
	private String publisher;
	private String isbn;
	private String description;
	private String pubdate;
	private int price;
	
	
	public BookDto(String title, String link, String image, String author, int discount, String publisher, String isbn,
			String description, String pubdate, int price) {
		super();
		this.title = title;
		this.link = link;
		this.image = image;
		this.author = author;
		this.discount = discount;
		this.publisher = publisher;
		this.isbn = isbn;
		this.description = description;
		this.pubdate = pubdate;
		this.price = price;
	}
	
	public BookDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getDiscount() {
		return discount;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getPubdate() {
		return pubdate;
	}
	public void setPubdate(String pubdate) {
		this.pubdate = pubdate;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", link=" + link + ", image=" + image + ", author=" + author + ", discount="
				+ discount + ", publisher=" + publisher + ", isbn=" + isbn + ", description=" + description
				+ ", pubdate=" + pubdate + ", price=" + price + "]";
	}
}
