package com.hari.library.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.hari.library.entity.MainClassification;

public interface MainClassificationRepository extends JpaRepository<MainClassification , String> {

	MainClassification findMainClassificationByMainId(String mainId);
	
	String findMainId = "SELECT main_Id from mainclassification";
	@Query(value = findMainId, nativeQuery = true)
	Object[] findMainId();

	
}
