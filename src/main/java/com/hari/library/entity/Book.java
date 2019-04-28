package com.hari.library.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(schema = "librarysystem" , name = "book")
public class Book implements Serializable {
	
	@Id
	private String bookId;
	private String bookName;
	
	@OneToOne(mappedBy = "book" , cascade = {CascadeType.ALL})
	@JoinColumn(name = "mainId" , nullable = false)
	MainClassification mainClassification;
	
	@OneToOne(mappedBy = "book" , cascade = {CascadeType.ALL})
	@JoinColumn(name = "subId" , nullable = false)
	SubClassification subClassification;

	public String getBookId() {
		return bookId;
	}

	public void setBookId(String bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public MainClassification getMainClassification() {
		return mainClassification;
	}

	public void setMainClassification(MainClassification mainClassification) {
		this.mainClassification = mainClassification;
	}

	public SubClassification getSubClassification() {
		return subClassification;
	}

	public void setSubClassification(SubClassification subClassification) {
		this.subClassification = subClassification;
	}
	
	

}
