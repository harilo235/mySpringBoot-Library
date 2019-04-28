package com.hari.library.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hari.library.entity.MainClassification;
import com.hari.library.repository.MainClassificationRepository;

@Service
public class MainClassServiceImpl implements MainClassService {

	@Autowired
	MainClassificationRepository mainClassRepository;
	@Override
	public void saveMainClassification(MainClassification mainClass) {
		mainClassRepository.save(mainClass);
	}

	@Override
	public List<MainClassification> getAllMainClass() {
		return mainClassRepository.findAll();
	}

	@Override
	public Object[] getAllMainClassId() {
		return mainClassRepository.findMainId();
	}

	@Override
	public MainClassification getMainClassificationById(String mainId) {
		return mainClassRepository.findMainClassificationByMainId(mainId);
	}

	public MainClassification deleteMainClasificationById(String mainId) {
		mainClassRepository.deleteById(mainId);
		return null;
	}

	public void updateMainClassificationById(MainClassification mainClass) {
		String mainId = mainClass.getMainId();
		boolean isExist = mainClassRepository.findMainClassificationByMainId(mainId) != null;
		if(isExist) {
			mainClassRepository.save(mainClass);
		}
	}
	
}
