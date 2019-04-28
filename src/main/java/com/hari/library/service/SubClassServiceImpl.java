package com.hari.library.service;

import java.util.List;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;

import com.hari.library.entity.SubClassification;
import com.hari.library.repository.SubClassificationRepository;

public class SubClassServiceImpl implements SubClassService {
	
	@Autowired
	SubClassificationRepository subClassRepository;
	
	public void saveSubClassification(@Valid @RequestBody SubClassification subClass) {
		subClassRepository.save(subClass);
	}

	@Override
	public List<SubClassification> getAllSubClass() {
		return subClassRepository.findAll();
	}

	@Override
	public SubClassification getSubClassificationById(String subClassId) {
		return subClassRepository.findSubClassificationBySubId();
	}

	@Override
	public List<SubClassification> getSubClassificationBymainId(String mainId) {
		return subClassRepository.findSubClassificationByMainClassificationMainClassId(mainId);
	}

	@Override
	public Object[] getSubClassName() {
		Object[] getSubName = subClassRepository.findSubClassificationName();
		return getSubName;
	}

	@Override
	public Object[] getSubClassNameByMainClassId(String mainId) {
		Object[] getSubName = subClassRepository.fetchSubClassNameByMainClassId(mainId);
		return getSubName;
	}

	@Override
	public void updateSubClassification(SubClassification subClass) {
		String subId = subClass.getSubId();
		boolean isExist = subClassRepository.findSubClassificationBySubClassId(subId) != null;
		if(isExist) {
			subClassRepository.save(subClass);
		}
	}

	@Override
	public SubClassification deleteSubClassById(String subId) {
		subClassRepository.deleteById(subId);
		return null;
	}

}