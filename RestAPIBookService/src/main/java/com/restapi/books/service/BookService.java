package com.restapi.books.service;

import java.util.HashSet;

import com.restapi.books.model.Book;

public interface BookService { 
	
	public HashSet<Book>findAllBooks();
	public void addBook(Book book);
	public void deleteAllBooks();
	public Book findByISBN(String isbn);

}
