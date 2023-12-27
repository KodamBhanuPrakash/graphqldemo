package com.springbootgraphql.services;

import java.util.List;

import com.springbootgraphql.entities.Book;

public interface BookService {
	
	Book create(Book book);
	
	List<Book> getAll();
	
	Book get(int id);

}
