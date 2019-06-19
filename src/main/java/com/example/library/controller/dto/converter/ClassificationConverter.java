package com.example.library.controller.dto.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.library.controller.dto.ClassificationDto;
import com.example.library.entity.Classification;

@Service
public class ClassificationConverter {
	public static List<ClassificationDto>  ClassificationEntityTOClassificationDtoList(List<Classification> ClassificationList) {
		if (ClassificationList != null) {
			List<ClassificationDto> listClassificationDto = new ArrayList<>();
			for (Classification classification : ClassificationList) {
				ClassificationDto classificationDto = new ClassificationDto();
				
				classificationDto.setId(classification.getId());
				classificationDto.setName(classification.getName());
				
				listClassificationDto.add(classificationDto);
			}
			return listClassificationDto;
		}
		
		return null;
	}



	public static Classification classificationdtoToClassificationEntity(ClassificationDto classificationDto) {
		Classification classification =new Classification();
		if(classificationDto !=null) {
			classification.setId(classificationDto.getId());
			classification.setName(classificationDto.getName());
			return classification;
		}
		return null;
	}
	
	public static ClassificationDto ClassificationEntityToclassificationDto(Classification classification) {
		ClassificationDto classificationDto =new ClassificationDto();
		if(classification !=null) {
			
			classificationDto.setId(classification.getId());
			classificationDto.setName(classification.getName());
			return classificationDto;
		}
		return null;
		
	}
}