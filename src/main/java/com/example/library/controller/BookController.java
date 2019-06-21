package com.example.library.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.library.controller.dto.BookDto;
import com.example.library.controller.dto.mapper.BookMapper;

@RestController
@CrossOrigin("")
public class BookController {
	@Autowired
	BookMapper bookMapper;
	
	@PostMapping("/saveBook")
	public ResponseEntity<String> saveBook(@Valid @RequestBody BookDto bookDto){
		if(bookMapper.saveBook(bookDto)!=null) {
			return new ResponseEntity<>("succesfully",HttpStatus.OK);
		}
		return new ResponseEntity<>("save faild",HttpStatus.BAD_REQUEST);
	}
	
	@GetMapping("/listBook")
	public List<BookDto> getBook(){
		return bookMapper.viewBook();
		
	}
	// get book id
	

}
