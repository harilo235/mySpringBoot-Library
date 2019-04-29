package com.hari.library.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hari.library.entity.SubClassification;
import com.hari.library.service.SubClassService;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class SubClassificationController {
	
	@Autowired
	SubClassService subClassService;
	
	@PostMapping("/saveSubClass")
	public HttpStatus saveSubClass(@Valid @RequestBody SubClassification subClass) {
		subClassService.saveSubClassification(subClass);
		return HttpStatus.CREATED;
	}
	
	@GetMapping("/getAllSubClass")
	public List<SubClassification> getAllSubClass(){
		return subClassService.getAllSubClass();
	}
	
	@GetMapping("/getAllsubClassId/{subId}")
	public ResponseEntity<SubClassification> getSubClassificationById(@PathVariable ("subId") String subId){
		return new ResponseEntity<SubClassification>(subClassService.getSubClassificationById(subId), HttpStatus.OK);
	}
	
	@GetMapping("/getAllSubClassByMainId/{mainId}")
	public List<SubClassification> getSubClassificationByMainId(@PathVariable("mainId") String mainId){
		return subClassService.getSubClassificationBymainId(mainId);
	}
	
	@GetMapping("/getAllSubClassName")
	public Object[] getAllSubName(){
		Object[] subName = subClassService.getSubClassName();
		return subName;	
	}
	
	@GetMapping("/getAllSubClassNameByMainId/{mainId}")
	public Object[] getSubClassNameByMainId(@PathVariable("mainId") String mainId){
		 Object[] subName = subClassService.getSubClassNameByMainId(mainId);
		 return subName;
	}
	
	@PutMapping("/updateSubClassification")
	public ResponseEntity<SubClassification> updateBook(@Valid @RequestBody SubClassification subClass) {
		subClassService.updateSubClassification(subClass);
		return new ResponseEntity<SubClassification>(subClass, HttpStatus.OK);
	}
	
	@DeleteMapping("/deleteSubClassById/{subId}")
	public ResponseEntity<SubClassification> deleteSubClassificationById(@PathVariable("subId") String subId){
		return new ResponseEntity<SubClassification>(subClassService.deleteSubClassById(subId), HttpStatus.OK);
	}

}
