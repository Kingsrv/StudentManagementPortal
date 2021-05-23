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
    private List<Student> getStudents() {
        return this.studentService.getStudent();
    }

    //view a particular student
    @GetMapping("/view/{rollNumber}")
    public Student getParticularStudent(@PathVariable Integer rollNumber) {
        return this.studentService.getParticularStudent(rollNumber);
    }

    //add student
    @PostMapping("/add")
    public Student addStudents(@RequestBody Student student) {
        return this.studentService.addStudent(student);
    }

    //update student details
    @PutMapping("/update")
    public Student updateStudents(@RequestBody Student student) {
        return this.studentService.updateStudent(student);
    }

    //delete student
    @DeleteMapping("/delete/{rollNumber}")
    public ResponseEntity<HttpStatus> deleteStudents(@PathVariable Integer rollNumber) {
        try {
            this.studentService.deleteStudent(rollNumber);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    //view all the students of a city
    @GetMapping("/view/{city}")
    public Student viewCityStudents(@PathVariable String city){
        return this.studentService.viewCityStudent(city);
    }
}

