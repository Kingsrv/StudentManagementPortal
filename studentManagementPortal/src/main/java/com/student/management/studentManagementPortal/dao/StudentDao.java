package com.student.management.studentManagementPortal.dao;

import com.student.management.studentManagementPortal.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentDao extends JpaRepository<Student, Integer> {
}
