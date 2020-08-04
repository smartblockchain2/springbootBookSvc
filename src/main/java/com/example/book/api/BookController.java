package com.example.book.api;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.book.model.Book;
import com.example.book.service.BookService;
@RequestMapping("api/v2/book")
@RestController
public class BookController {
	
	private final BookService bookService;
	
	@Autowired
	public BookController(BookService bookService) {
		this.bookService = bookService;
	}
	
	@PostMapping
	public void addBook(Book book) {
		bookService.addBook(book);	
	}
	
	@GetMapping
	public List<Book> getAllBooks(){
		return bookService.getAllBooks();
	}
	
	
	// below are my novice hacks when starting this assignment
	@RequestMapping(value= "/getBook", method = RequestMethod.GET)
	public Book GetBookInfo() {
		UUID id = UUID.randomUUID();
		
		Book book = new Book();
		book.setId(id);
		book.setIsbn("021558025");
		book.setTitle("A Book Title");
		book.setAuthors("Tom Smith");
		book.setPages(348);	

		return book;
	}
	
	@RequestMapping(value= "/getAllBooks", method = RequestMethod.GET)
	public List<Book> GetAllBooks() {
		UUID id1 = UUID.randomUUID();
		Book book1 = new Book();
		book1.setId(id1);
		book1.setIsbn("021558025");
		book1.setTitle("A Book Title");
		book1.setAuthors("Tom Smith");
		book1.setPages(348);	
		
		UUID id2 = UUID.randomUUID();
		Book book2 = new Book();
		book2.setId(id2);
		book2.setIsbn("1234567");
		book2.setTitle("Tom Sawyer");
		book2.setAuthors("Mark Twain");
		book2.setPages(500);
		
		List<Book> books = new ArrayList<>();
		books.add(book1);
		books.add(book2);
		return books;
	}

}
