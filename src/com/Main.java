package com;

import com.model.Author;
import com.model.Book;

public class Main {
	public static void main(String[] args) {
		Book book = new Book();
		book.setTitle("Harry Porter");
		Author author = new Author();
		author.setAuthor("Harry");
		System.out.println(book);
	}
}
