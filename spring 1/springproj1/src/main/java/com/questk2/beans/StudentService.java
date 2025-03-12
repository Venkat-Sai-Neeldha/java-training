package com.questk2.beans;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    
   
    @Autowired
    private Student student;

    //
    private final String schoolName;

    @Autowired
    public StudentService(String schoolName) {
        this.schoolName = schoolName;
    }

    
    private String courseName;

    @Autowired
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void displayStudentDetails() {
        System.out.println("Student Name: " + student.getName());
        System.out.println("School Name: " + schoolName);
        System.out.println("Course Name: " + courseName);
    }
}

