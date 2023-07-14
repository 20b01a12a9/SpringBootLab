package com.restapi.books.model;

public class Book {
	String isbn;

	String author;

	String title;

	public String getIsbn() {

		return isbn;

	}

	public Book() {

		super();

	}

	public Book(String isbn, String author, String title) {

		super();

		this.isbn = isbn;

		this.author = author;

		this.title = title;

	}

	public void setIsbn(String isbn) {

		this.isbn = isbn;

	}

	public String getAuthor() {

		return author;

	}

	public void setAuthor(String author) {

		this.author = author;

	}

	public String getTitle() {

		return title;

	}

	public void setTitle(String title) {

		this.title = title;

	}

}


