package com.example.company.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.company.entity.Student;

public interface StudentRepository 
	extends JpaRepository<Student, Long> {
	
}
