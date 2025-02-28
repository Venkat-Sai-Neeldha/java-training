package comp72;

import java.util.Date;
/**
 * @author venkat
 * @apiNote employee class 
 * 
 * */
public class Employee {
    private Integer empId;
    private String empName;
    private Department department;
    private Double salary;
    private Date empJoinDate;
//constructor
    public Employee(Integer empId, String empName, Department department, Double salary, Date empJoinDate) {
        this.empId = empId;
        this.empName = empName;
        this.department = department;
        this.salary = salary;
        this.empJoinDate = empJoinDate;
    }

    public int getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    public Department getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public Date getEmpJoinDate() {
        return empJoinDate;
    }

    @Override
    public String toString() {
        return "Employee{" +"empId=" + empId +", empName='" + empName + '\'' + ", department=" + department.getDeptName() +
                ", salary=" + salary + ", empJoinDate=" + empJoinDate +'}';
    }
}