package com.springbootgraphql.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbootgraphql.entities.Book;
import com.springbootgraphql.repositories.BookRepo;
import com.springbootgraphql.services.BookService;

@Service
public class BookServiceImpl implements BookService {

	@Autowired
	private BookRepo bookRepo;

	@Override
	public Book create(Book book) {
		return this.bookRepo.save(book);
	}

	@Override
	public List<Book> getAll() {
		return this.bookRepo.findAll();
	}

	@Override
	public Book get(int id) {
		return this.bookRepo.findById(id).get();
	}
	
}
