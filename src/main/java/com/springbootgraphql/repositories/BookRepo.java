package com.springbootgraphql.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springbootgraphql.entities.Book;

public interface BookRepo extends JpaRepository<Book, Integer>{
	
}
