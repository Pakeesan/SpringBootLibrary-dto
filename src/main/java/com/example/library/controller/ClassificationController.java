package com.example.library.controller;

import java.util.List;

import javax.validation.Valid;
import javax.xml.ws.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	//get Classification
	@GetMapping("/listClassification")
	public List<ClassificationDto> getAllClassification(){
		return classificationMapper.getClassification();
		
	}
	//get classificationId
	@GetMapping("/listClassificationId/{classificationid}")
		public ClassificationDto getClassificationById(@PathVariable(name="classificationid")Long classificationid) {
			return classificationMapper.getClassificationById(classificationid);
		}
	
	//delete classification
	@DeleteMapping("/deleteclass/{classificationid}")
	public ResponseEntity<String> deleteClassification(@PathVariable("classificationid") Long classificationid) {
		System.out.println(classificationid);
		
		if(classificationMapper.getClassificationById(classificationid)!=null) {
			if(classificationMapper.deleteClassification(classificationid)==null) {
				return new ResponseEntity<> ("succesfully deleted",HttpStatus.OK);
			}
				
			}
		else {
				return new ResponseEntity<>("Classification id not found",HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<>("delete faild",HttpStatus.BAD_REQUEST);
	}
	
	@PutMapping("/update")
	public ResponseEntity<String> updateClassification(@RequestBody ClassificationDto classificationDto) {
		if(classificationMapper.updateClassification(classificationDto)!=null) {
			return new ResponseEntity<String>("success update",HttpStatus.OK);
			
		}
		
		return new ResponseEntity<>("faild",HttpStatus.BAD_REQUEST);
	}
	
}
