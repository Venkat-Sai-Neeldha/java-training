package day14comparator;
/**
 * @author venkat
 * @apiNote department class with id name
 * */

public class Department {
    private int deptId;
    private String deptName;

    /**
     * @apiNote constructor for department
     * */
    public Department(int deptId, String deptName) {
        this.deptId = deptId;
        this.deptName = deptName;
    }
    /*
     * getter method
     * */
    public String getDeptName() {
        return deptName;
    }
}