package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Students;
import com.example.repo.StudentRepository;

import lombok.AllArgsConstructor;

import java.util.List;
import java.util.Optional;

@Service

public class StudentService {
    
	@Autowired
	private StudentRepository studentRepository;

	  @Autowired
	    public StudentService(StudentRepository studentRepository) {
	        this.studentRepository = studentRepository;
	    }
	  
	
	
    public List<Students> getAllStudents() {
        return studentRepository.findAll();
    }
    
    public Students getStudentById(Long studentId) {
        Optional<Students> optionalUser = studentRepository.findById(studentId);
        return optionalUser.get();
    }
   
}
