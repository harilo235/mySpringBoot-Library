package com.hari.library.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hari.library.entity.Book;

public interface BookRepository extends JpaRepository<Book , String> {

}
