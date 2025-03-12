package com.questk2.main;



import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.questk2.beans.StudentService;
import com.questk2.config.Appconfiguration;

public class SpringApp {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Appconfiguration.class);

        StudentService studentService = context.getBean(StudentService.class);
        studentService.displayStudentDetails();
    }
}
