package com.surender.DBdocker_demo.controller;

import com.surender.DBdocker_demo.model.Student;
import com.surender.DBdocker_demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    StudentService studentService;

    @RequestMapping("/getStudents")
    public List<Student> getStudents(){
      return studentService.getStudents();
    }
    @RequestMapping("/addStudent")
    public void addStudent(){
        Student student = new Student();
        student.setName("SKM");
        student.setAge(30);
        studentService.save(student);
    }
}
