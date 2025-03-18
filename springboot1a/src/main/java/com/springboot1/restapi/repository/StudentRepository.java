package com.springboot1.restapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot1.restapi.entity.Student;

public interface StudentRepository extends JpaRepository<Student,Integer> {

}
