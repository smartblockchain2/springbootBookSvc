package com.example.book.model;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@Entity
@Table(name = "books")
@JacksonXmlRootElement(localName = "Book")
public class Book  {
	/**
	 * 
	 */
	//private static final UUID serialVersionUID = 1L;
	//@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private UUID id;
	@JacksonXmlProperty(isAttribute = true)
	private String isbn;
	@JacksonXmlProperty
	private String title;
	@JacksonXmlProperty
	private String authors;
	@JacksonXmlProperty
	private int pages;
	@JacksonXmlProperty
	private String categories;
	
	public Book() {}
	public Book(UUID id, String isbn, String title, String authors, int pages, String categories)
	{
		this.isbn = isbn;
		this.title = title;
		this.authors = authors;
		this.pages = pages;
		this.categories = categories;
	}
	public UUID getId() {
		return id;
	}
	public void setId(UUID id) {
		this.id = id;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthors() {
		return authors;
	}
	public void setAuthors(String authors) {
		this.authors = authors;
	}
	public int getPages() {
		return pages;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
	public String getCategories() {
		return categories;
	}
	public void setCategories(String categories) {
		this.categories = categories;
	}
	
	@Override
	public String toString()
	{
		return "Book [isbn=" + isbn + ", title=" + title + ", authors=" + authors + ", pages=" + ", categories=" + categories + "]";
	}
}
