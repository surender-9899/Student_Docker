package com.surender.DBdocker_demo.service;

import com.surender.DBdocker_demo.Dao.StudentRepo;
import com.surender.DBdocker_demo.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    StudentRepo studentRepo;
    public List<Student> getStudents() {
        return studentRepo.findAll();
    }

    public void save(Student student) {
        studentRepo.save(student);
    }
}
