package com.example.cruddemo;

import java.util.Optional;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.cruddemo.entity.Student;
import com.example.cruddemo.repository.StudentRepository;

@SpringBootTest
class CrudDemo2ApplicationTests {
	
	@Autowired
	private StudentRepository studentRepo;
//save
	@Test
	void saveOneStudent() {
		Student s =new Student ();
		s.setCourse("java");
		s.setFee(10000);
		s.setName("naveen");
		studentRepo.save(s);
		
	}
//Delete
	@Test
	void deleteOneStudent() {
		studentRepo.deleteById(3L);
	}
//Update
	@Test 
	void updateOneStudent() {
		Student s =new Student ();
		s.setId(1);
		s.setCourse("Python");
		s.setFee(10000);
		s.setName("jaison");
		studentRepo.save(s);
	}
//Read
	@Test
	void getOneStudent() {
		Optional<Student> findById = studentRepo.findById(1L);
		Student s = findById.get();
		System.out.println(s.getId());
		System.out.println(s.getCourse());
		System.out.println(s.getFee());
		System.out.println(s.getName());
	}

}
