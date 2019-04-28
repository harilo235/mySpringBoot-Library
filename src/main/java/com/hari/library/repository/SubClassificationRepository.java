package com.hari.library.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hari.library.entity.SubClassification;

public interface SubClassificationRepository extends JpaRepository<SubClassification, String> {

	SubClassification findSubClassificationBySubId();

	List<SubClassification> findSubClassificationByMainClassificationMainClassId(String mainId);

	Object[] fetchSubClassNameByMainClassId(String mainId);

	Object[] findSubClassificationName();

	Object findSubClassificationBySubClassId(String subId);


}
