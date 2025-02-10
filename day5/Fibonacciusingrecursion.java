package day5;
import java.util.Scanner;
public class Fibonacciusingrecursion {
	//recursion class
	public static  int fibonacci(int num) {
		if(num==0) {
			return 0;
		}
	else if(num==2||num==1) {
			return 1;
		}
	   return fibonacci(num-1)+fibonacci(num-2);
	}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the no of terms in sequence");
		int num=scan.nextInt();
		for(int seq=0;seq<num;seq++) {
			System.out.println(fibonacci(seq));
			scan.close();
		}
		
	}

}
