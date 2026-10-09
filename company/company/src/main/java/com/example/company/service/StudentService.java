package com.example.company.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.company.entity.Student;
import com.example.company.repository.StudentRepository;

@Service
public class StudentService {

    private final StudentRepository repository;

    public StudentService(StudentRepository repository) {
        this.repository = repository;
    }

    public Student saveStudent(Student student) {
        return repository.save(student);
    }

    public List<Student> getAllStudents() {
        return repository.findAll();
    }

    public Optional<Student> getStudentById(Long id) {
        return repository.findById(id);
    }

    public void deleteStudent(Long id) {
        repository.deleteById(id);
    }
}