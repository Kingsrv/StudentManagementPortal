package com.student.management.studentManagementPortal.controller;

import com.student.management.studentManagementPortal.entities.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Mycontroller {

    @Autowired
    private com.student.management.studentManagementPortal.services.studentService studentService;

    //view all students
    @GetMapping("/view")
    private List<Student> getStudents(){
        return this.studentService.getStudent();
    }
    //view a particular student
    @GetMapping("/view/{rollNumber}")
    public Student getParticularStudent(@PathVariable String rollNumber){
        return this.studentService.getParticularStudent(Long.parseLong(rollNumber));
    }
    //add student
    @PostMapping("/add")
    public Student addStudents(@RequestBody Student student){
        return this.studentService.addStudent(student);
    }
    //update student details
    @PutMapping("/update")
    public Student updateStudents(@RequestBody Student student){
        return this.studentService.updateStudent(student);
    }
    //delete student
    @DeleteMapping("/view/{rollNumber}")
    public ResponseEntity<HttpStatus> deleteStudents(@PathVariable String rollNumber){
        try{
            this.studentService.deleteStudent(Long.parseLong(rollNumber));
            return new ResponseEntity<>(HttpStatus.OK);
        }catch(Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}

