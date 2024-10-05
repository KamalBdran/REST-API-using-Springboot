package com.example.sjprogramming.restapi.repository;

import com.example.sjprogramming.restapi.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer>{


}