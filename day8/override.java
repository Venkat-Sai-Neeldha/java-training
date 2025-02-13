package Com.pack;
/**
 * @author venkat
 * @apiNote this is a program implementing method overriding
 * 
 * 
 * 
 * 
 * **/
class loan{                                 //parent class loan
	public double getIntrest() {
		System.out.println("this is a parent class method");
		return 6.25;
	}
}
class homeloan extends loan{                      //child class method
	public double getIntrest() {
		System.out.println("this is a child class method");
		return 8.75;                                         //overriding
	}
}

public class override {

	public static void main(String[] args) {
		loan obj=new homeloan();              //parent class reference object implementing child class method
		System.out.println(obj.getIntrest());
	}

}
