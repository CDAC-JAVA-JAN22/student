package com.cybage.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.cybage.model.Student;
import com.cybage.service.StudentService;

@RestController
public class StudentController{
    @Autowired
    Student s;
    StudentService ss;

    @PostMapping("/")
    ResponseEntity<Student> addStudent(@RequestBody Student st){
        ss.addStudent(st);
        return new ResponseEntity<>(st, HttpStatus.OK);
    }

    @GetMapping("/")
    ResponseEntity<List<Student>> getAllStudents(){
        List<Student> l = ss.getAllStudents();
        return new ResponseEntity<>(l, HttpStatus.OK);
    }

}
