package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Students;
import com.example.service.StudentService;

import java.awt.print.Pageable;
import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {
   
	@Autowired
	public StudentService studentService;

		
		  @GetMapping("/All") 
		  public List<Students> getAllStudents() { 
			  
			  return studentService.getAllStudents(); 
			  }
		  
		  @GetMapping("/{id}")
		    public Students getUserById(@PathVariable("id") Long studentId){
		        
			  return studentService.getStudentById(studentId);
		    }
		
		  
		  
    }

    


	
	
	
	
	
	

