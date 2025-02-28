package comp72;
import java.util.*;

public class EmployeeService {
    private Map<String, List<Employee>> employeeMap = new HashMap<String, List<Employee>>();
     /**
      * @apiNote adding employees to the map
      * @throws ManagerException
      * 
      * */
    public void addEmployee(Employee employee) throws ManagerException {
        String deptName = employee.getDepartment().getDeptName();
        List<Employee> employees = employeeMap.getOrDefault(deptName, new ArrayList<Employee>());

        /**
         * checking for the duplicate id's
         * 
         * */
        for (Employee e : employees) {
            if (e.getEmpId() == employee.getEmpId()) {
                throw new ManagerException("Employee already exists with the same ID.");
            }
        }

       
        employees.add(employee);
        employeeMap.put(deptName, employees);

        /**sorting by name*/
        Collections.sort(employees, new Comparator<Employee>() {
            public int compare(Employee e1, Employee e2) {
                return e1.getEmpName().compareTo(e2.getEmpName());
            }
        });

        printEmployeesByDepartment(deptName);
        System.out.println();
    }
    /**
     * @apiNote deleting employees from the map
     * @throws ManagerException
     * 
     * */
    public void deleteEmployee(Integer empId, String deptName) throws ManagerException {
        List<Employee> employees = employeeMap.get(deptName);
        if (employees == null) {
            throw new ManagerException("No employees found in department: " + deptName);
        }

        Employee employeeToDelete = null;
        for (Employee e : employees) {
            if (e.getEmpId() == empId) {
                employeeToDelete = e;
                break;
            }
        }

        if (employeeToDelete == null) {
            throw new ManagerException("Employee not found in department: " + deptName);
        }

        employees.remove(employeeToDelete);
        System.out.println("Employee deleted successfully!");
        printEmployeesByDepartment(deptName);
        System.out.println();
    }
    /**
     * @apiNote updating employee details 
     * @throws ManagerException
     * 
     * */

    public void updateEmployee(Integer empId, String deptName, Employee updatedEmployee) throws ManagerException {
        List<Employee> employees = employeeMap.get(deptName);
        if (employees == null) {
            throw new ManagerException("No employees found in department: " + deptName);
        }

        Employee employeeToUpdate = null;
        for (Employee e : employees) {
            if (e.getEmpId() == empId) {
                employeeToUpdate = e;
                break;
            }
        }

        if (employeeToUpdate == null) {
            throw new ManagerException("Employee not found in department: " + deptName);
        }

   
        employees.remove(employeeToUpdate);
        employees.add(updatedEmployee);

        /**
         * default sorting
         * */
        Collections.sort(employees, new Comparator<Employee>() {
            public int compare(Employee e1, Employee e2) {
                return e1.getEmpName().compareTo(e2.getEmpName());
            }
        });

        System.out.println("Employee updated successfully!");
        printEmployeesByDepartment(deptName);
        System.out.println();
    }

    public List<Employee> getEmployee(String deptName) {
        List<Employee> employees = employeeMap.get(deptName);
        if (employees != null) {
            /**
             *  Sort employees by join date in reverse order*/
            Collections.sort(employees, new Comparator<Employee>() {
                public int compare(Employee e1, Employee e2) {
                    return e2.getEmpJoinDate().compareTo(e1.getEmpJoinDate());
                }
            });
        }
        System.out.println();
        return employees;
       
    }
/**
 * @apiNote method to print the map values
 * 
 * */
    public void printEmployeesByDepartment(String deptName) {
        List<Employee> employees = employeeMap.get(deptName);
        if (employees == null || employees.isEmpty()) {
            System.out.println("No employees found in department: " + deptName);
        } else {
            System.out.println("Employees in department: " + deptName);
            for (Employee e : employees) {
                System.out.println(e);
            }
        }
    }

    /**
     * scenario to create concurrent modification 
     * */
    public void ExampleException() {
        List<Employee> employees = new ArrayList<Employee>(employeeMap.get("developer"));
        for (Employee e : employees) {
            employeeMap.get("developer").remove(e);
        }
    }
}
