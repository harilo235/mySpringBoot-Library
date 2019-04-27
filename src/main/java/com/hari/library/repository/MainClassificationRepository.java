package com.hari.library.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hari.library.entity.MainClassification;

public interface MainClassificationRepository extends JpaRepository<MainClassification , Long> {
	
}
