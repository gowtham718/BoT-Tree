package com.shopping;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class BookShopApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(BookShopApplication.class, args);
		Book book=context.getBean(Book.class);
		System.out.println(book.getBookId());
		System.out.println(book.getBookName());
		System.out.println(book.getBookPrice());
		
		
		Bookutil bookutil=context.getBean(Bookutil.class);
		bookutil.offer("5");
		
	}

}