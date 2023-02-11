package com.example.demoporject;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Controller {
      
	@Autowired
	StudentRepository studentRepository;
	
	@RequestMapping("/get-students")
	public ResponseEntity<List<Student>> getStudents()
	{
		return ResponseEntity.ok(studentRepository.findAll());
	}
}
