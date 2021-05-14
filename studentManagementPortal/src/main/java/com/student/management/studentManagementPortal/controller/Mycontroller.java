package com.student.management.studentManagementPortal.controller;

import com.student.management.studentManagementPortal.entities.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

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
}

