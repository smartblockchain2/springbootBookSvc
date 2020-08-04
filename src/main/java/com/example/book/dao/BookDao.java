package com.example.book.dao;

import com.example.book.model.Book;

import java.util.List;
import java.util.UUID;


public interface BookDao {
	
	int insertBook(UUID id, Book book);
	
	default int insertPerson(Book book) {
		UUID id = UUID.randomUUID();
		return insertBook(id, book);
	}
	
	List<Book> selectAllBooks();
	
}
