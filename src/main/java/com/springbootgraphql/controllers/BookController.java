package com.springbootgraphql.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springbootgraphql.entities.Book;
import com.springbootgraphql.services.BookService;

@RestController
@RequestMapping("/books")
public class BookController {
	
	@Autowired
	private BookService bookService;
	
	@PostMapping("/create")
	public Book create(@RequestBody Book book) {
		return bookService.create(book);
	}

	@GetMapping
	public List<Book> getAll() {
		return bookService.getAll();
	}
	
	@GetMapping("/{id}")
	public Book get(@PathVariable int id) {
		return this.bookService.get(id);
	}
}
