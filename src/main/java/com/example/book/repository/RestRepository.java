package com.example.book.repository;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.book.model.Book;

// TODO:  Ok to remove this class.  Not currently in use.

@RepositoryRestResource
public interface RestRepository extends CrudRepository<Book, UUID>{

}
