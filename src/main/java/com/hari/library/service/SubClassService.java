package com.hari.library.service;

import java.util.List;

import com.hari.library.entity.SubClassification;

public interface SubClassService {
	
	void saveSubClassification (SubClassification subClass);
	List<SubClassification> getAllSubClass();
	Object[] getAllSubId();
	SubClassification getSubClassificationById(String subId);
	List<SubClassification> getSubClassificationBymainId(String mainId);
	Object[] getSubClassName();
	Object[]getSubClassNameByMainClassId(String mainId);
	void updateSubClassification(SubClassification subClass);
	SubClassification deleteSubClassById(String subId);

}
