package com.Spring.springMysql.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Spring.springMysql.Entity.Student;

public interface StudentRepo extends JpaRepository<Student, Integer>{

}
