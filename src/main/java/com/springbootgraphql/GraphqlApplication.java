package com.springbootgraphql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.springbootgraphql.entities.Book;
import com.springbootgraphql.services.BookService;

@SpringBootApplication
public class GraphqlApplication implements CommandLineRunner{

	@Autowired
	private BookService bookService;
	
	public static void main(String[] args) {
		SpringApplication.run(GraphqlApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Book book1 = new Book();
		book1.setAuthor("Book 1 Author");
		book1.setDesc("book 1 desc");
		book1.setTitle("book 1 title");
		
		Book book2 = new Book();
		book2.setAuthor("Book 2 Author");
		book2.setDesc("book 2 desc");
		book2.setTitle("book 2 title");
		
		Book book3 = new Book();
		book3.setAuthor("Book 3 Author");
		book3.setDesc("book 3 desc");
		book3.setTitle("book 3 title");
		
		this.bookService.create(book1);
		this.bookService.create(book2);
		this.bookService.create(book3);
	}

}
