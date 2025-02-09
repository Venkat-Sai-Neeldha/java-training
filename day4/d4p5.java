package day4;
import java.util.Scanner;

public class d4p5 {

	public static void main(String[] args) {
		// taking use input
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the number :");
		int number= sc.nextInt();
		
		//writing a for loop
		for(int i=1;i<=number;i++) {
			//condition for divisibility
			if(i%2==0 && i%3==0  && i%5!=0) {
				System.out.println(i);
			}
			//skip divisible by 5
			else if(i%5==0) {
				continue;
			}
		}
		sc.close();

	}

}
