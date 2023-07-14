package com.restapi.books.controller;

import java.util.HashSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.restapi.books.model.Book;
import com.restapi.books.service.BookServiceImpl;

@RestController
public class BooksController { 
	
	@Autowired
	BookServiceImpl bookservice;
	//we have to expose the methods
	@PostMapping("/")
	public void addBook(@RequestBody Book book) {
	bookservice.addBook(book);
	}
	@GetMapping("/findall")
	public HashSet<Book>getAllBooks(){
	return bookservice.findAllBooks();
	}
	@DeleteMapping("/delete")
	public void deleteAllBooks() {
	bookservice.deleteAllBooks();
	}
	@GetMapping("/findbyisbn/{id}")
	public Book getBookByISBN(String isbn) {
	return bookservice.findByISBN(isbn);
	}

}
