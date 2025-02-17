package day10exception;

import java.util.Scanner;
/**
 * @author venkat
 * @apiNote this is a program for illegal argument exception
 * 
 * **/
public class votingException {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		try {
		System.out.println("enter the age");
		int age=scan.nextInt();
		scan.close();
		if(age<18) {
       	 throw new IllegalArgumentException("you are not allowed to vote");
       	
        }
        else {
       	 System.out.println("you can vote");
        }
		}
		catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
        
	}

}
