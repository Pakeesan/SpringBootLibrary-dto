package com.example.library.controller.dto.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.library.controller.dto.BookDto;
import com.example.library.entity.Book;

@Service
public class BookConverter {
	
	//converte entity to dto list
	
	public static List<BookDto> bookEntityToBookDtoList(List<Book> bookList){
		if(bookList != null) {
			List<BookDto> listbookDto=new ArrayList<>();
			for(Book book : bookList) {
				BookDto bookDto = new BookDto();
				
				bookDto.setBid(book.getId());
				bookDto.setBname(book.getName());
				
				listbookDto.add(bookDto);
			}
			return listbookDto;
		}
		return null;
	}
	//converte entity to dto 
	public static BookDto bookentityToBookDto(Book book) {
		BookDto bookDto =new BookDto();
		if(book !=null) {
			bookDto.setBid(book.getId());
			bookDto.setBname(book.getName());
			return bookDto;
		}
		
		return null;
		
	}
	//converte dto to entity
	public static Book bookDtoTobookEntity(BookDto bookDto) {
		Book book=new Book();
		if(bookDto !=null) {
			book.setId(bookDto.getBid());
			book.setName(bookDto.getBname());
			return book;
		}
		return null;
	}
}
