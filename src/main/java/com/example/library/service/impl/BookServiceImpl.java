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
		return bookRepository.findBookById(bookid);
	}

	@Override
	public Book deleteBook(Long bookid) {
		
		bookRepository.deleteById(bookid);
		return null;
	}
	//book update 

	@Override
	public Book updateBook(Book book) {
		Long id =book.getId();
		
		boolean isExit= bookRepository.findBookById(id)!=null;
		if(isExit) {
		return bookRepository.save(book);
		}else {
			
		}return null;
	}
	

}
