package com.example.cruddemo.repository;

import org.springframework.data.repository.CrudRepository;


import com.example.cruddemo.entity.Student;

public interface StudentRepository extends CrudRepository<Student, Long> {

}
