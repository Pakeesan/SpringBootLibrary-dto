package com.example.library.service;

import java.util.List;

import com.example.library.entity.Book;

public interface BookService {
	
	public Book saveBook(Book book);
	
	public List<Book> listAllBook();
	
	public Book getBookById(Long bookid);
	
	public Book deleteBook(Long bookid);
	
	public Book updateBook(Book book);
}
