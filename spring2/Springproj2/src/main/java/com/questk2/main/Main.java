package com.questk2.main;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.questk2.beans.Employeeservice;
import com.questk2.config.Appconfiguration;


public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Appconfiguration.class);

        Employeeservice employeeService = context.getBean(Employeeservice.class);
        employeeService.displayEmployeeDetails();
       ((AbstractApplicationContext) context).close();
    }
}
