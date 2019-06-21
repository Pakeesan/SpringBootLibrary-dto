package com.example.library.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.library.entity.Classification;
import com.example.library.repositorys.ClassificationRepository;
import com.example.library.service.ClassificationService;

@Service
public class ClassificationServiceImpl implements ClassificationService{
	
	@Autowired
	ClassificationRepository classificationRepository;

	@Override
	public Classification saveClassification(Classification classification) {
		
		return classificationRepository.save(classification);
	}

	@Override
	public List<Classification> getClassification() {


		return classificationRepository.findAll();
	}
	// get Classification id
	@Override
	public Classification getClassificationById(Long classificationid) {
		
		return classificationRepository.findClassificationById(classificationid);
	}
	// classification delete
	@Override
	public Classification deleteClassification(Long classificationid) {
		 classificationRepository.deleteById(classificationid);
		 return null;
	}
	// update classification 
	@Override
	public Classification updateClassification(Classification classification) {
		Long id =classification.getId();
		
		boolean isExist =classificationRepository.findClassificationById(id) !=null;
		if(isExist) {
		return classificationRepository.save(classification);
	}else {
		
	}
		return null;
	}

}
