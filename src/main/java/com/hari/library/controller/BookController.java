package com.hari.library.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hari.library.entity.Book;
import com.hari.library.service.BookService;

@RestController
public class BookController {
	
	@Autowired
	BookService bookService;
	
	@PostMapping("/saveBook")
	public HttpStatus createBook(@Valid @RequestBody Book book) {
		bookService.saveBook(book);
		return HttpStatus.CREATED;	
	}
	
	@GetMapping("/getAllBook")
	public List<Book> getAllBook() {
		return bookService.getAllBook();
	}
	
	@GetMapping("/getBookById/{id}")
	public ResponseEntity <Book> getBookById(@PathVariable("id") String id){
		return new ResponseEntity<Book>(bookService.getBookById(id),HttpStatus.OK);	
	}
	
	@GetMapping("/getBookByMainId/{mainId}")
	public List <Book> getBookByMainId(@PathVariable("mainId") String mainId){
		return bookService.getBookByMainId(mainId);
	}
	
	@GetMapping("/getBookBySubId/{subId}")
	public List <Book> getBookBySubId(@PathVariable("subId") String subId){
		return bookService.getBookBySubId(subId);
	}
	
	@GetMapping("/getBookbyBookName/{bookName}")
	public List <Book> getBookByBookName(@PathVariable("bookName") String bookName){
		return bookService.getBookByBookName(bookName);
	}
	
	@PutMapping("/updateBook/")
	public ResponseEntity <Book> updateBook (@Valid @RequestBody Book book){
		bookService.updateBook(book);
		return new ResponseEntity<Book> (book , HttpStatus.ACCEPTED);
	}
	
	@DeleteMapping("/deleteBook/{id}")
	public ResponseEntity<Book> deleteBook (@PathVariable ("id") String id){
		bookService.deleteBookById(id);
		return new ResponseEntity<Book>(HttpStatus.NO_CONTENT);	
	}
}
