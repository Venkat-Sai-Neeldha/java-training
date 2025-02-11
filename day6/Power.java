package day6;

 import java.util.Scanner;
/**
 * @author venkat
 * @apiNote this is a recursive program to find the power of a number
 */
public class Power {
     public static int powermethod(int base,int exp) {
    	 if(exp!=0) {
    		 return base*powermethod(base,exp-1); //recursion step
    	 }
    	 else return 1; // base step
     }
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		
		System.out.println("enter the base value");
		int base=scan.nextInt();                     // taking base value as input 
		System.out.println("enter the power to calculate");
		int exp=scan.nextInt();                          // taking power value as input 
		System.out.println(base+" raised to the power "+exp+" = "+powermethod(base,exp));
		scan.close();
	}

}
