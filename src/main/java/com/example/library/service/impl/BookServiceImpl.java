package com.example.library.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.library.entity.Book;
import com.example.library.repositorys.BookRepository;
import com.example.library.service.BookService;

@Service
public class BookServiceImpl implements BookService{
	
	@Autowired
	private BookRepository bookRepository;
	
	@Override
	public Book saveBook(Book book) {
		
		return bookRepository.save(book);
	}

	@Override
	public List<Book> listAllBook() {
		
		return bookRepository.findAll();
	}

	@Override
	public Book getBookById(Long bookid) {
		
		return bookRepository.findBookbyId(bookid);
	}
	

}
