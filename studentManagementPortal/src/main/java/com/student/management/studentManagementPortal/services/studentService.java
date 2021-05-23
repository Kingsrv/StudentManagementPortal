package com.student.management.studentManagementPortal.services;

import com.student.management.studentManagementPortal.entities.Student;

import java.util.List;

public interface studentService {

    public List<Student> getStudent();

    public Student addStudent(Student student);

    public Student updateStudent(Student student);

    public void deleteStudent(Integer parseInt);

    public Student getParticularStudent(Integer rollNumber);

    public Student viewCityStudent(String City);
}
