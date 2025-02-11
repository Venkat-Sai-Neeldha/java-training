package day6;
import java.util.Scanner;

/**
 * @author venkat
 * @apiNote this is a recursive program to find the GCD of two numbers
 */
public class GCD {
      static int gcd(int fno,int sno) {
    	  if(sno<=0) {
    		  return fno;
    	  }
    	  else return gcd(sno,fno%sno);
      }
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the values of first number");
		int fno=scan.nextInt();
		System.out.println("enter the second number ");
		int sno=scan.nextInt();
		System.out.println("GCD of "+fno+" and "+sno+" is "+gcd(fno,sno));
		scan.close();
	}

}
