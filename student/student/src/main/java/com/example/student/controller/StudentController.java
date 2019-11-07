package com.example.student.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.student.model.Student;

@RestController
@RequestMapping("student")
public class StudentController {

	@GetMapping(value = "/{name}", consumes = MediaType.APPLICATION_JSON_VALUE , produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Student> getStudentDetails(@PathVariable String name) {
		Student student = new Student();
		student.setName(name);
		student.setId(1);
		student.setCollege("Government arts college");
		return new ResponseEntity<Student>(student, HttpStatus.OK);
	}
}
