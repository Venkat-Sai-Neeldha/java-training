package comp72;
/**
 * @author venkat
 * @apiNote department class 
 * 
 * */
public class Department {
    private Integer deptId;
    private String deptName;
//constructor
    public Department(Integer deptId, String deptName) {
        this.deptId = deptId;
        this.deptName = deptName;
    }

    public int getDeptId() {
        return deptId;
    }

    public String getDeptName() {
        return deptName;
    }
}