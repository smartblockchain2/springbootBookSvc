package com.example.book.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import com.example.book.model.Book;

@Repository("fakeDao")
public class FakeBookDataAccessService implements BookDao{
	private static List<Book> mockDB = new ArrayList<>();

	@Override
	public int insertBook(UUID id, Book book) {
		mockDB.add(new Book(id, book.getIsbn(), book.getTitle(), book.getAuthors(), book.getPages(), book.getCategories()));
		return 1;
	}

	@Override
	public List<Book> selectAllBooks() {
		return mockDB;
	}
	
}
