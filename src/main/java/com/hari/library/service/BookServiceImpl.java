package com.hari.library.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.hari.library.entity.Book;
import com.hari.library.repository.BookRepository;

public class BookServiceImpl implements BookService {

	@Autowired
	BookRepository bookRepository;
	
	@Override
	public void saveBook(Book book) {
		bookRepository.save(book);
	}

	@Override
	public List<Book> getAllBook() {
		return bookRepository.findAll();
	}

	@Override
	public Book getBookById(String id) {
		return bookRepository.findBookById(id);
	}

	@Override
	public Book deleteBookById(String id) {
		bookRepository.deleteById(id);
		return null;
	}

	@Override
	public void updateBook(Book book) {
		String bookId = book.getBookId();
		boolean isExist = bookRepository.findBookById(bookId) != null;
		if(isExist) {
			bookRepository.save(book);
		}
	}

	@Override
	public List<Book> getBookByMainId(String mainId) {
		return bookRepository.findBookByMainId(mainId);
	}

	@Override
	public List<Book> getBookBySubId(String subId) {
		return bookRepository.findBookBySubId(subId);
	}

	@Override
	public List<Book> getBookByBookName(String bookName) {
		return bookRepository.findBookByBookName(bookName);
	}


}
