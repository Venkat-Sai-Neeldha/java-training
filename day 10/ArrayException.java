package day10exception;

import java.util.Scanner;

/**
 * @author venkat
 * @apiNote program to write more than one exception
 * **/
public class ArrayException {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int []arr= {1,2,3,4,5,6};

		System.out.println("enter any index value for an array");
		int num=scan.nextInt();
		scan.close();
		try {
			if(num>arr.length-1 || num<0) {
				throw new ArrayIndexOutOfBoundsException("enter valid index");
			}
			else if(num>6) {
				throw new NumberFormatException("enter an integer");
			}
			else {
			   System.out.println(arr[num]);
			}
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		catch(NumberFormatException e1) {
			System.out.println(e1.getMessage());
		}
		

	}

}
