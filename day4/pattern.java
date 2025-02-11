
import java.util.Scanner;
/**
 * 
 * @author venkat
 * @apiNote program to print a pattern
 * 
 * **/
public class pattern {
public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		//taking input from user
		
		System.out.println("enter the no of rows: ");
		int rows =scan.nextInt();
		//outer loop
	    for(int outer=1;outer<=rows;outer++) {
	       //inner loop
	    	for(int innerloop=1;innerloop<=outer;innerloop++) {
	    		// condition for even count rows
	    		if(outer%2==0) {
	    			System.out.print(outer);
	   
	    		}
	    		//condition for odd rows
	    		else {
	    			System.out.print("*");
	    		}
	    	}
	    	System.out.println();
	    }
       scan.close();
	}
}
