package com.student.studentmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.student.studentmanagement.model.Student;



public interface StudentRepository extends JpaRepository<Student, Long>{

}