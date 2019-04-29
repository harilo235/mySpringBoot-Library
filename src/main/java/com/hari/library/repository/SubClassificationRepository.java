package com.hari.library.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.hari.library.entity.SubClassification;

public interface SubClassificationRepository extends JpaRepository<SubClassification, String> {

	SubClassification findSubClassificationBySubId();

	List<SubClassification> findSubClassificationByMainClassificationMainClassId(String mainId);
	
	String findSubClassificationName= "SELECT sub_Name from subclassification";
	@Query(value=findSubClassificationName , nativeQuery=true)
	Object[] findSubClassificationName();
	
	String fetchSubClassNameByMainClassId = "SELECT sub_Name from subclassification WHERE main_id?=1";
	@Query(value=fetchSubClassNameByMainClassId , nativeQuery=true)
	Object[] fetchSubClassNameByMainClassId(String mainId);

	String findSubClassificationBySubClassId= "SELECT sub_Id from subclassification";
	@Query(value=findSubClassificationBySubClassId , nativeQuery=true)
	Object findSubClassificationBySubClassId(String subId);


}
