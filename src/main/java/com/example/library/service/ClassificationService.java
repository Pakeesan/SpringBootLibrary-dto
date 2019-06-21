package com.example.library.service;

import java.util.List;

import com.example.library.entity.Classification;

public interface ClassificationService {
	// save classification
	public Classification saveClassification(Classification classification);
	
	public List<Classification> getClassification();
	
	public Classification getClassificationById(Long classificationid);
	
	public Classification deleteClassification(Long classificationid);
	
	public Classification updateClassification(Classification classification);

}
