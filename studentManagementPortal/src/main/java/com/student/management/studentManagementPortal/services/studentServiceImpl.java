package com.student.management.studentManagementPortal.services;

import com.student.management.studentManagementPortal.entities.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class studentServiceImpl implements studentService {

    List<Student> list;
    public studentServiceImpl(){
        list = new ArrayList<>();
        list.add(new Student(43,"Saurav Sinha",27,"Patna"));
        list.add(new Student(43,"Harshit Sinha",25,"Hyderabad"));
        list.add(new Student(43,"Gaurav Kumar",26,"Bangalore"));
        list.add(new Student(43,"Alok Kumar",24,"Kolkata"));
    }

    @Override
    public List<Student> getStudent() {
        return list;
    }
}
