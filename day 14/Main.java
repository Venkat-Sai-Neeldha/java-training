package day14comparator;
import java.text.SimpleDateFormat;
import java.util.*;
/**
 * @author venkat
 * @apiNote main class for execution
 * */
public class Main {
    public static void main(String[] args) {
        try {
            /** 
             *  Create department class objects*/
            Department itDept = new Department(1, "IT");
            Department hrDept = new Department(2, "HR");

            /*** 
             * Create employee class objects
             * */
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Employee emp1 = new Employee(101, "venkat", itDept, 60000, sdf.parse("2020-01-01"));
            Employee emp2 = new Employee(102, "sai", hrDept, 50000, sdf.parse("2019-05-01"));
            Employee emp3 = new Employee(103, "raju", itDept, 70000, sdf.parse("2021-02-15"));

            /** 
             * Create EmployeeManager*/
            EmployeeManager manager = new EmployeeManager();

            /** Add employees*/
            System.out.println("Adding Employees:");
            manager.addEmployee(emp1);
            manager.addEmployee(emp2);
            manager.addEmployee(emp3);

            /** 
             * Update employee*/
            manager.updateEmployee(103, "IT", "ram", 75000);

            /** 
             * Delete employee*/
          
            manager.deleteEmployee(102, "HR");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

