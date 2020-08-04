package com.example.book.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.book.dao.BookDao;
import com.example.book.model.Book;

@Service
public class BookService {
	
	private final BookDao bookDao;
	
	@Autowired
	public BookService(@Qualifier("fakeDao") BookDao bookDao) {
		this.bookDao = bookDao;
	}
	
	public int addBook(Book book) {
		return bookDao.insertPerson(book);
	}
	
	public List<Book> getAllBooks(){
		return bookDao.selectAllBooks();
	}
}
