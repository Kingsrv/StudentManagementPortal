package com.student.management.studentManagementPortal.dao;

import com.student.management.studentManagementPortal.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface StudentDao extends JpaRepository<Student, Integer> {

    @Query("select s from Student s where s.city = :city")
    public List<Student> fetchByCity(@Param("city") String city);

}
