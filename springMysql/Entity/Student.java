package com.Spring.springMysql.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Entity   
//corresponds t ospringboot 
@Table(name="Student_DB")
@NoArgsConstructor
@AllArgsConstructor
public class Student {
	//every entity in springboot has its own repository through which it executes quries and other stuff.
	@Id
	@Column(name="ID")
	@GeneratedValue
   private int id;
	@Column(name="ST_MARK")
	private int mark;
	
	@Column(name="NAME")
	private String name;
	
}
