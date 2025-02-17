package day10exception;
import java.util.Scanner;

/**
 * @author venkat
 * @apiNote this is a program to find divide by zero exception
 * 
 * **/
public class dividebyzero {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the first number");
		int num1=scan.nextInt();
		
		int num2=0;
		try {
			int div=num1/num2;
			System.out.println(div);
		}
		catch(Exception e){
			System.out.println("cannot divide a number by zero");
		}
		finally {
			System.out.println("program continues");
		}
		scan.close();

	}

}
