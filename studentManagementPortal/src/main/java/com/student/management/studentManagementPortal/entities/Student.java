package com.student.management.studentManagementPortal.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class Student {
    @Id
    private Integer rollNumber;
    private String name;
    private int age;
    private String city;

    public Student() {
    }

    public Student(int rollNumber, String name, int age, String city) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.age = age;
        this.city = city;
    }

    public Integer getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

}
