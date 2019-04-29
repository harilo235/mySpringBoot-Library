package com.hari.library.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hari.library.entity.MainClassification;
import com.hari.library.service.MainClassService;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class MainClassificationController {
	
	@Autowired
	MainClassService mainClassService;
	
	@PostMapping("/saveMainClass")
	public HttpStatus saveMainClass(@RequestBody @Valid MainClassification mainClass) {
		MainClassService.saveMainClassification(mainClass);
		return HttpStatus.CREATED;
		
	}
	
	@GetMapping("/getAllMainClass")
	public List<MainClassification> getAllMainClass(){
		return mainClassService.getAllMainClass();
	}
	
	@GetMapping("/getAllMainClassId")
	public Object[] getAllMainclassId() {
		Object[] mainName = mainClassService.getAllMainClassId();
		return mainName;
	}
	
	@GetMapping("/getMainClassById/{mainId}")
	public ResponseEntity <MainClassification> getMainClassificationById(@PathVariable ("mainId") String mainId){
		return new ResponseEntity <MainClassification> (mainClassService.getMainClassificationById(mainId),HttpStatus.OK);
	}
	
	@PutMapping ("/updateMainClassification")
	public ResponseEntity<MainClassification> updateBook (@RequestBody @Valid MainClassification mainClass){
		mainClassService.updateMainClassificationById(mainClass);
		return new ResponseEntity <MainClassification> (mainClass , HttpStatus.ACCEPTED );
	}
}
