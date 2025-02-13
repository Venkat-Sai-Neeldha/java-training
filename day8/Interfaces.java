package Com.pack;
/**
 * @author venkat
 * @apiNote this is a program implementing interfaces
 * 
 * 
 * 
 * 
 * **/
interface vehicle{           //creating interface
	public void start();
}
 class car implements vehicle{              //sub class  car of interface              
	public void start() {             
		System.out.println("car starts in 2 seconds");
	}
}  
class bike implements vehicle {                //subclass bike of interface
	public void start() {
		System.out.println("bike starts in 1 second");
		
	}
}

public class Interfaces {
  
	public static void main(String[] args) {
		car obj=new car();                        //object creation
		obj.start();
		bike obj1 =new bike();
		obj1.start();

	}

}
