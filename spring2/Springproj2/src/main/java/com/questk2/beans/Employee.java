package com.questk2.beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
 
@Component
@Scope("singleton")
public class Employee {

    private String name;
 
    public Employee() {

        this.name = "Default employee";

        System.out.println("employee Bean: Constructor Called");

    }
 
    @PostConstruct

    public void init() {

        System.out.println("Employee Bean: @PostConstruct  Called");

    }
 
    @PreDestroy

    public void destroy() {

        System.out.println("Employee Bean: @PreDestroy Called");

    }
 
    public String getName() {

        return name;

    }
 
    public void setName(String name) {

        this.name = name;

    }

}

 