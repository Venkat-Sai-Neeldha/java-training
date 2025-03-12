package com.questk2.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Service
public class Employeeservice {
   // Field Injection
   @Autowired
   private Employee employee;

   private final String orgName;

   @Autowired
   public  Employeeservice(@Value("QuestK2 organization") String orgName) {
       this.orgName = orgName;
   }

   // Setter Injection using @Value
   private String deptName;

   @Autowired
   public void setDeptName(@Value("development") String deptName) {
       this.deptName = deptName;
   }

   @PostConstruct
   public void init() {
       System.out.println("EmployeeService Bean: @PostConstruct  Called");
   }

   @PreDestroy
   public void destroy() {
       System.out.println("EmployeeService Bean: @PreDestroy  Called");
   }

   public void displayEmployeeDetails() {
       System.out.println("employee Name: " + employee.getName());
       System.out.println("org Name: " + orgName);
       System.out.println("dept Name: " + deptName);
   }
}