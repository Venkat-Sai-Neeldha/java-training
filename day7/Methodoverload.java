/**
 * @author venkat
 * @apiNote this is a program to implement method overloading
 * 
 * 
 * 
 * **/
public class Methodoverload {
        
    static void method(int x) {                         //method with one parameter
	    System.out.println("this is a method1 output");
		           }
	static void method(int x,int y) {                   // method with two parameter
			System.out.println("this is a method2 output");
		    }
	
	
	
	public static void main(String[] args) {
		method(1);
		method(1,2);

	}

}
