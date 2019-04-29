package com.hari.library.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.hari.library.entity.Book;

public interface BookRepository extends JpaRepository<Book , String> {
	
	Book findBookById(String id);
	List<Book> findBookByMainId (String mainId);
	List<Book> findBookBySubId (String subId);
	
	String fetchBookByBookName = "SELECT * from book WHERE book_name LIKE %?1%";
	@Query(value= fetchBookByBookName , nativeQuery=true)
	List<Book> findBookByBookName (String bookName);

}
