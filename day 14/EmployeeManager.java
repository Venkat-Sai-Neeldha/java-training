package day14comparator;
import java.util.*;
/**
 * @author venkat
 * @apiNote employee manager class for comparison
 * 
 * */
public class EmployeeManager {
    private Map<String, List<Employee>> departmentMap = new HashMap<>();

    /**
     * Adding employee to list
     * */
    public void addEmployee(Employee employee) throws EmployeeManagementException {
    	
        departmentMap.putIfAbsent(employee.getDepartment().getDeptName(), new ArrayList<>());
        
        List<Employee> employees = departmentMap.get(employee.getDepartment().getDeptName());

        /**
         *  Check if employee already exists by empId
         * 
         * */
        if (employees.stream().anyMatch(emp -> emp.getEmpId() == employee.getEmpId())) {
            throw new EmployeeManagementException("Employee with ID " + employee.getEmpId() + " already exists.");
        }

        employees.add(employee);
        printEmployeesSortedByName(employee.getDepartment().getDeptName());
    }

    /** 
     * Deleting the employee details*/
    public void deleteEmployee(int empId, String deptName) throws EmployeeManagementException {
    	
        List<Employee> employees = departmentMap.get(deptName);
        
        if (employees == null || employees.isEmpty()) {
            throw new EmployeeManagementException("No employees found in department " + deptName);
        }

        employees.removeIf(emp -> emp.getEmpId() == empId);
        printEmployeesSortedByName(deptName);
    }

    /** 
     * Updating  the employee details*/
    public void updateEmployee(int empId, String deptName, String newName, double newSalary) throws EmployeeManagementException {
        List<Employee> employees = departmentMap.get(deptName);
        
        if (employees == null || employees.isEmpty()) {
            throw new EmployeeManagementException("No employees found in department " + deptName);
        }

        for (int iter = 0; iter < employees.size(); iter++) {
            Employee emp = employees.get(iter);
            
            if (emp.getEmpId() == empId) {
                employees.set(iter, new Employee(empId, newName, emp.getDepartment(), newSalary, emp.getEmpJoinDate()));
                printEmployeesSortedByName(deptName);
                return;
            }
        }

        throw new EmployeeManagementException("Employee with ID " + empId + " not found.");
    }

    /***
     * Print employees sorted by name*/
    private void printEmployeesSortedByName(String deptName) {
        List<Employee> employees = departmentMap.get(deptName);
        
        if (employees != null) {
            employees.sort(Comparator.comparing(Employee::getEmpName));
            System.out.println("Employees in department " + deptName + " sorted by name:");
            employees.forEach(System.out::println);
        }
    }
}