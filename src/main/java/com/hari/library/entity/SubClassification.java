package com.hari.library.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(schema = "librarysystem" , name = "subclassification")
public class SubClassification implements Serializable {
	
	@Id
	private String subId;
	private String subName;
	
	@ManyToOne
	@JoinColumn(name = "mainId" , nullable = false)
	MainClassification mainClassification;

	

	public String getSubId() {
		return subId;
	}

	public void setSubId(String subId) {
		this.subId = subId;
	}

	public String getSubName() {
		return subName;
	}

	public void setSubName(String subName) {
		this.subName = subName;
	}

	public MainClassification getMainClassification() {
		return mainClassification;
	}

	public void setMainClassification(MainClassification mainClassification) {
		this.mainClassification = mainClassification;
	}
	
	

}
