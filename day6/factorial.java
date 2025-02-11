package day6;
import java.util.Scanner;

/**
 * @author venkat
 * @apiNote this is a recursive program to find the factorial
 */
public class factorial {
	public static int fact(int num) {
		if(num==1) {
			return 1;      //base step
		}
		else return num*fact(num-1);  //recursive step
	}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number ");
		int num=scan.nextInt();                   // taking user input
		System.out.println("factorial of  "+num+" is "+fact(num));
		scan.close();
	}

}
