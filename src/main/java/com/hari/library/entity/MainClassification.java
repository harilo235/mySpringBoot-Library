package com.hari.library.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@SuppressWarnings("serial")
@Entity
@Table(schema = "librarysystem", name="mainclassification")
public class MainClassification implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long mainId;
	private String mainName;
	
	@OneToMany(mappedBy="mainclassification" , cascade= {CascadeType.ALL})
	private List<SubClassification> subClassification;
	
	public Long getMainId() {
		return mainId;
	}

	public void setMainId(Long mainId) {
		this.mainId = mainId;
	}

	public String getMainName() {
		return mainName;
	}

	public void setMainName(String mainName) {
		this.mainName = mainName;
	}

	public List<SubClassification> getSubClassification() {
		return subClassification;
	}

	public void setSubClassification(List<SubClassification> subClassification) {
		this.subClassification = subClassification;
	}
	

}
