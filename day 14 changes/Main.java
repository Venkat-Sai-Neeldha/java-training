package comp72;

import java.util.Date;
/**
 * @author venkat
 * @apiNote main class for execution
 * */
public class Main {
    public static void main(String[] args) {
        try {
            Department devs = new Department(1, "developer");
            Department tester = new Department(2, "tester");

            EmployeeService employeeService = new EmployeeService();

            Employee emp1 = new Employee(1, "Venkat", devs, (double) 50000, new Date(122, 3, 1));
            Employee emp2 = new Employee(2, "Ajay", devs, (double) 60000, new Date(121, 4, 2)); 
            Employee emp3 = new Employee(3, "Bharath", tester, (double) 70000, new Date(123, 2, 15)); 
            Employee emp4 = new Employee(4, "sai", devs, (double) 50000, new Date(120, 3, 1));
            Employee emp5 = new Employee(5, "jagadhish", devs, (double) 60000, new Date(123, 4, 2));
            Employee emp6 = new Employee(6, "revanth", tester, (double) 70000, new Date(124, 2, 15)); 
            Employee emp7 = new Employee(7, "manivas", tester, (double) 75000, new Date(121, 2, 15)); 
            Employee emp8 = new Employee(8, "praveen", tester, (double) 50000, new Date(120, 2, 15)); 

            // Adding employees
            employeeService.addEmployee(emp1);
            employeeService.addEmployee(emp2);
            employeeService.addEmployee(emp3);
            employeeService.addEmployee(emp4);
            employeeService.addEmployee(emp5);
            employeeService.addEmployee(emp6);
            employeeService.addEmployee(emp7);
            employeeService.addEmployee(emp8);

            // Deleting a employee
            employeeService.deleteEmployee(1, "developer");

            // Updating employee
            Employee updatedEmp2 = new Employee(2, "vinay", devs, (double) 65000, new Date(121, 4, 2));
            employeeService.updateEmployee(2, "developer", updatedEmp2);

            /**
             * reverse order 
             * */
            System.out.println("Employees in tester Department:");
            employeeService.getEmployee("tester");

           /**
            * concurrent modification example scenario
            * */
            employeeService.ExampleException();

        } catch (ManagerException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}