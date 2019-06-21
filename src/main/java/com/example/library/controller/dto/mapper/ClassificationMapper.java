package com.example.library.controller.dto.mapper;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.library.controller.dto.ClassificationDto;
import com.example.library.controller.dto.converter.ClassificationConverter;
import com.example.library.entity.Classification;
import com.example.library.service.ClassificationService;

@Service
public class ClassificationMapper {
	
	@Autowired
	ClassificationConverter classificationConverter;
	
	@Autowired
	ClassificationService classificationService;
	
	// save classification
	@SuppressWarnings("static-access")
	public Classification saveClassification(ClassificationDto classificationDto) {
		return classificationService.saveClassification(classificationConverter.classificationdtoToClassificationEntity(classificationDto));
				
	}
	// list classification
	@SuppressWarnings("static-access")
	public List<ClassificationDto> getClassification(){
		//List<Classification> listClassification
		List<Classification> listClassification = classificationService.getClassification();
		return classificationConverter.ClassificationEntityTOClassificationDtoList(listClassification);
	}
	
	// get Classification id 
	@SuppressWarnings("static-access")
	public ClassificationDto getClassificationById(Long classificationid) {
		Classification classification =classificationService.getClassificationById(classificationid);
		return classificationConverter.ClassificationEntityToclassificationDto(classification);
		
	}
	// delete classification
	public ClassificationDto deleteClassification(Long classificationid) {
		
		Classification classification=classificationService.deleteClassification(classificationid);
		return null;
		
	}
	//update Classification
	@SuppressWarnings("static-access")
	public Classification updateClassification(ClassificationDto classificationDto) {
		return classificationService.updateClassification(classificationConverter.classificationdtoToClassificationEntity(classificationDto));
	}
}
