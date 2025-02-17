package day10exception;
/**
 * @author venkat
 * @apiNote program for custom salary exception
 */
 class InvalidSalaryException extends Exception{

	private static final long serialVersionUID = 1L;
	 public InvalidSalaryException(String message) {
		 super(message);
	 }
 }

public class customSalary {
     static void setSalary(double salary) throws InvalidSalaryException {
    	 if(salary<3000) {
    		 throw new InvalidSalaryException("invalid salary");
    	 }
    	 else {
    		 System.out.println("salary set successfully");
    	 }
     }
	public static void main(String[] args) {
	   
       try {
    	   setSalary(2500);
       }
       catch(InvalidSalaryException e) {
    	   System.out.println(e.getMessage());
       }
	}

}
