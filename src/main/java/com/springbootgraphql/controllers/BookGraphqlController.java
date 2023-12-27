package com.springbootgraphql.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.springbootgraphql.entities.Book;
import com.springbootgraphql.services.BookService;

@Controller
public class BookGraphqlController {
	
	@Autowired
	private BookService bookService;
	
	public Book create(@RequestBody Book book) {
		return bookService.create(book);
	}

	@QueryMapping("allBooks")
	public List<Book> getAll() {
		return bookService.getAll();
	}
	
	@QueryMapping("getBook")
	public Book get(@Argument int id) {
		return this.bookService.get(id);
	}
}
