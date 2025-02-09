package day4;
import java.util.Scanner;
public class d4p3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		//taking input from user
		
		System.out.println("enter the no of rows: ");
		int rows =sc.nextInt();
		//outer loop
	    for(int i=1;i<=rows;i++) {
	       //inner loop
	    	for(int j=1;j<=i;j++) {
	    		// condition for even count rows
	    		if(i%2==0) {
	    			System.out.print(i);
	   
	    		}
	    		//condition for odd rows
	    		else {
	    			System.out.print("*");
	    		}
	    	}
	    	System.out.println();
	    }
       sc.close();
	}

}
