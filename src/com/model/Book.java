package com.model;

public class Book {
	private String title;
	private String Author;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return Author;
	}
	public void setAuthor(String author) {
		Author = author;
	}
	public Book(String title, String author) {
		super();
		this.title = title;
		Author = author;
	}
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Book [title=" + title + ", Author=" + Author + "]";
	}
	
	
	
}
