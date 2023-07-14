package com.restapi.books.service;

import java.util.HashSet;

import org.springframework.stereotype.Service;

import com.restapi.books.model.Book;

@Service
public class BookServiceImpl { 
	
	HashSet<Book>bookList = new HashSet<Book>();
	public HashSet<Book> findAllBooks() {
		// TODO Auto-generated method stub
		if(!bookList.isEmpty())
			return bookList;
		else
		    return null;
	}

	public void addBook(Book book) {
		// TODO Auto-generated method stub
		bookList.add(book);

	}

	public void deleteAllBooks() {
		// TODO Auto-generated method stub
		bookList.clear();

	}

	public Book findByISBN(String isbn) {
		// TODO Auto-generated method stub
		Book book=bookList.stream().filter((b) -> b.getIsbn().equals(isbn)).findAny().orElse(null);
		return book;
	}


}
