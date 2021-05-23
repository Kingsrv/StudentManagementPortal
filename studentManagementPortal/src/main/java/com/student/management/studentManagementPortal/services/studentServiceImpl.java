package com.student.management.studentManagementPortal.services;

import com.student.management.studentManagementPortal.dao.StudentDao;
import com.student.management.studentManagementPortal.entities.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class studentServiceImpl implements studentService {

    @Autowired
    private StudentDao studentDao;

    //List<Student> list;
    public studentServiceImpl() {
        //    list = new ArrayList<>();
        //    list.add(new Student(43,"Saurav Sinha",27,"Patna"));
        //    list.add(new Student(31,"Harshit Sinha",25,"Hyderabad"));
        //    list.add(new Student(23,"Gaurav Kumar",26,"Bangalore"));
        //    list.add(new Student(11,"Alok Kumar",24,"Kolkata"));
        //    list.add(new Student(10,"Amit Kumar",35,"Tejpur"));

    }

    @Override
    public List<Student> getStudent() {
        return studentDao.findAll();
    }

    @Override
    public Student addStudent(Student student) {
//        list.add(student);
        studentDao.save(student);
        return student;
    }

    @Override
    public Student updateStudent(Student student) {
//        list.forEach(s -> {
//            if (s.getRollNumber() == student.getRollNumber()){
//                s.setCountry(student.setCountry());
//                s.setSex(student.setsex());
//            }
//        });
        studentDao.save(student);
        return student;
    }

    @Override
    public void deleteStudent(Integer parseInt) {
//      list = this.list.stream().filter(s->s.getRollNumber()!=parseLong).collect(Collectors.toList());
        Student entity = studentDao.getOne(parseInt);
        studentDao.delete(entity);
    }

    @Override
    public Student getParticularStudent(Integer rollNumber) {
//        Student s = null;
//        for (Student student:list) {
//            if(student.getRollNumber()==rollNumber){
//                s = student;
//                break;
//            }
//        }
        return studentDao.findById(rollNumber).get();
    }

    @Override
    public Student viewCityStudent(String City) {
        Student s = null;
        List<Student> allStudent = studentDao.findAll();
        List<Student> cityWiseStudent;
        for(Student Student:allStudent){
            if(Student.getCity()==city){
                cityWiseStudent.add();
            }

        }
    }
}
