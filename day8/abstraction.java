package Com.pack;
/**
 * @author venkat
 * @apiNote this is a program implementing abstraction
 * 
 * 
 * 
 * 
 * **/
abstract class shape{                  //abstract class
	public abstract double calculateArea(int x,int y); //abstract method
}

class rectangle extends shape{
	public double calculateArea(int x,int y) {   //child class rectangle
		//
		return x*y;
	}
	
}
class circle extends shape{                      //child class circle
	public double calculateArea(int x,int y) {
		return 3.14*x*y;
	}
}

public class abstraction {

	public static void main(String[] args) {
		rectangle obj=new rectangle();                //rectangle class object
		System.out.println(obj.calculateArea(3, 4));
		circle obj1=new circle();                         //circle class object
		System.out.println(obj1.calculateArea(6, 6));

	}

}
