package com.example.sjprogramming.restapi.controller;

import java.util.List;
import com.example.sjprogramming.restapi.entity.Student;
import com.example.sjprogramming.restapi.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {

    @Autowired
    StudentRepository repo;

    @GetMapping("/students")
    public List<Student> getAllStudents() {
        List<Student> students = repo.findAll();

        return students;
    }

    @GetMapping("/students/{id}")
    public Student getStudent(@PathVariable int id) {
        Student  student = repo.findById(id).get();

        return student;
    }
    @PostMapping("/student/add")
    @ResponseStatus(code = HttpStatus.CREATED)
    public void createStudent (@RequestBody Student student){
repo.save(student);
    }
    @PutMapping("/student/update/{id}")
//    @ResponseStatus(code = HttpStatus.CREATED)
    public Student updateStudents (@PathVariable int id,
                                   @RequestParam String name,
                                   @RequestParam String branch,
                                   @RequestParam float percentage){
        Student student = repo.findById(id).get();
        student.setName(name);
        student.setPercentage(percentage);
        student.setBranch(branch);
        repo.save(student);
        return student;
    }
    @DeleteMapping("/student/delete/{id}")
    public  void deletetStudent(@PathVariable int id) {
        Student student = repo.findById(id).get();
        repo.delete(student);
    }

}

