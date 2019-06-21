package com.example.library.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.library.entity.Classification;

public interface ClassificationRepository extends JpaRepository<Classification,Long>{
	
	Classification findClassificationById(Long id);
}

