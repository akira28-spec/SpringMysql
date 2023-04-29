package com.Spring.springMysql.Controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Spring.springMysql.Entity.Student;
import com.Spring.springMysql.Service.StudentService;

@RestController
@RequestMapping
public class StudentController {
 @Autowired
	
	private StudentService studentService;
 @PostMapping("/addStudent")
 public Student postDetails( @RequestBody Student student) {
	return studentService.saveDetails(student);
	 
 }
}
