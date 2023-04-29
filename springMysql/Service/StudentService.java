package com.Spring.springMysql.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Spring.springMysql.Entity.Student;
import com.Spring.springMysql.Repository.StudentRepo;

import lombok.Data;

@Service

@Data
public class StudentService {
@Autowired 
	private StudentRepo studentRepo;
	
public Student saveDetails(Student student) {
	return studentRepo.save(student);
	
}
}
