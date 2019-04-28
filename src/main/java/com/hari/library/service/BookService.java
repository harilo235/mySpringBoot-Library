package com.hari.library.service;

import java.util.List;

import com.hari.library.entity.Book;

public interface BookService {
	
	void saveBook(Book book);
	List<Book> getAllBook();
//	Book getBookById(String id);
	Book deleteBookById(String id);
	void updateBook(Book book);
	

}
