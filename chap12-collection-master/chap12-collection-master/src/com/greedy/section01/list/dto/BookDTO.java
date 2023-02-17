package com.greedy.section01.list.dto;

public class BookDTO implements Comparable<BookDTO> {
	
	private int number;
	private String title;
	private String author;
	private int price;
	
	public BookDTO() {}

	public BookDTO(int number, String title, String author, int price) {
		super();
		this.number = number;
		this.title = title;
		this.author = author;
		this.price = price;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "BookDTO [number=" + number + ", title=" + title + ", author=" + author + ", price=" + price + "]";
	}

	@Override
	public int compareTo(BookDTO o) {
		// this와 비교 대상 객체 BookDTO o를 비교하여 number 오름차순 정렬
		return number - o.number;
	}

	
}
