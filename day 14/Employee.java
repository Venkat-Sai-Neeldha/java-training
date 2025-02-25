package day14comparator;
import java.util.Date;
/**
 * @author venkat
 * @apiNote employee class 
 * */
public class Employee {
    private int empId;
    private String empName;
    private Department department;
    private double salary;
    private Date empJoinDate;

    
    /**
     * constructor for employee
     * */
    public Employee(int empId, String empName, Department department, double salary, Date empJoinDate) {
        this.empId = empId;
        this.empName = empName;
        this.department = department;
        this.salary = salary;
        this.empJoinDate = empJoinDate;
    }

    
    /**
     * @return getter and setter methods
     * */
    public int getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    public Department getDepartment() {
        return department;
    }

    public Date getEmpJoinDate() {
        return empJoinDate;
    }

    @Override
    public String toString() {
        return "Employee{" + "empId=" + empId + ", empName='" + empName + '\'' + ", department=" + department.getDeptName() + ", salary=" + salary + ", empJoinDate=" + empJoinDate + '}';
    }
}