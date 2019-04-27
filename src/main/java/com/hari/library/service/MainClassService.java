package com.hari.library.service;

import java.util.List;

import com.hari.library.entity.MainClassification;

public interface MainClassService {
	
	void saveMainClassification (MainClassification mainClass);
	List <MainClassification> getAllMainClass();
	Object[] getAllMainClassId();
	MainClassification getMainClassificationById(String mainClassId);
	MainClassification deleteMainClasificationById(String mainClassId);
	void updateMainClassificationById(MainClassification mainClass);

}
