package com.example.library.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.library.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long>{
	public Book findBookById(Long bookid);
}
