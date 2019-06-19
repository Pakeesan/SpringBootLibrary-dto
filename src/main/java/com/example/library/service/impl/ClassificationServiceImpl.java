package com.example.library.service.impl;

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
		// TODO Auto-generated method stub
		return classificationRepository.save(classification);
	}
	

}
