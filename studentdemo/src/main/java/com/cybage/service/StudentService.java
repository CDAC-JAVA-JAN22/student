package com.cybage.service;

import com.cybage.repository.StudentRepo;
import com.cybage.service.StudentService;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService{
    @Autowired
    StudentRepo sr;
    Student s;

    public Student addStudent(Student s){
        this.s =  sr.save();
        return s;
    }

    public Student getStudentById(int id){
        s = sr.findById(id).orElse(null);
        return s;
    }

    public List<Student> getAllStudents(){
        return sr.findAll();
    }

    public Student updateStudent(Student s){
        this.s = sr.save(s);
        return s;
    }

    public void deleteStudent(int id){
        sr.deleteById(id);
    }
}