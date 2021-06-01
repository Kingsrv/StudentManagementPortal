package com.student.management.studentManagementPortal.services;

import com.student.management.studentManagementPortal.entities.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface studentService {

    public List<Student> getStudent();

    public Student addStudent(Student student);

    public Student updateStudent(Student student);

    public void deleteStudent(Integer parseInt);

    public Student getParticularStudent(Integer rollNumber);

    public List<Student> viewCityStudent(String City);
}
