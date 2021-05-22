package com.student.management.studentManagementPortal.services;

import com.student.management.studentManagementPortal.entities.Student;

import java.util.List;

public interface studentService {

    public List<Student> getStudent();
    public Student addStudent(Student student);
    public Student updateStudent(Student student);
    public void deleteStudent(Long parseLong);

    public Student getParticularStudent(long rollNumber);
}
