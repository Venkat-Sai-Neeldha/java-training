/**
 * @author venkat
 * @apiNote this is a program to implement a constructor overloading
 * 
 * 
 * 
 * **/
public class constoverload {
     constoverload(int x){                             //constructor one
    	 System.out.println("this is const one obj"); 
     }
     constoverload(int x,int y){                       // constructor two
 
    	 System.out.println("this is const two obj");
     }
	public static void main(String[] args) {
		constoverload obj=new constoverload(1);
		constoverload obj2=new constoverload(1,2);
		
	}

}
