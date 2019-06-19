package com.example.library.controller;

import javax.validation.Valid;
import javax.xml.ws.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.library.controller.dto.ClassificationDto;
import com.example.library.controller.dto.mapper.ClassificationMapper;

@RestController
public class ClassificationController {
	
	@Autowired
	private ClassificationMapper classificationMapper;
	
	//save all classification
	@PostMapping("/saveClassification")
	public ResponseEntity<String> saveClassification(@Valid @RequestBody ClassificationDto classificationDto){
		if(classificationMapper.saveClassification(classificationDto) != null) {
			
		
		return new ResponseEntity<>("save succesfully",HttpStatus.OK); 
	}
	return new ResponseEntity<>("save FAILED",HttpStatus.BAD_REQUEST);
	
		
}
}
