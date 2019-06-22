package com.example.library.controller.dto.mapper;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.library.controller.dto.BookDto;
import com.example.library.controller.dto.converter.BookConverter;
import com.example.library.entity.Book;
import com.example.library.service.BookService;

@Service
public class BookMapper {
	
	@Autowired
	BookService bookService;
	
	@Autowired
	BookConverter bookConverter;
	
	//save Book
	@SuppressWarnings("static-access")
	public Book saveBook(BookDto bookDto) {
		return bookService.saveBook(bookConverter.bookDtoTobookEntity(bookDto));
		
	}
	//list book
	@SuppressWarnings("static-access")
	public List<BookDto> viewBook() {
		List<Book> listbook=bookService.listAllBook();
		return bookConverter.bookEntityToBookDtoList(listbook);
	}
	
	@SuppressWarnings("static-access")
	public BookDto getById(Long bookid) {
		Book book=bookService.getBookById(bookid);
		return bookConverter.bookentityToBookDto(book);
	}
	
	@SuppressWarnings("unused")
	public BookDto deleteBook(Long bookid) {
		Book book =bookService.deleteBook(bookid);
		return null;
	}
	
	
}
