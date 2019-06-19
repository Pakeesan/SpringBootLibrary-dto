package com.example.library.controller.dto.mapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.library.controller.dto.ClassificationDto;
import com.example.library.controller.dto.converter.ClassificationConverter;
import com.example.library.entity.Classification;
import com.example.library.service.ClassificationService;

@Service
public class ClassificationMapper {
	
	@Autowired
	ClassificationMapper classificationMapper;
	
	@Autowired
	ClassificationService classificationService;
	
	// save classification
	@SuppressWarnings("static-access")
	public Classification saveClassification(ClassificationDto classificationDto) {
		return classificationService.saveClassification(ClassificationConverter.classificationdtoToClassificationEntity(classificationDto));
				
	}
}
