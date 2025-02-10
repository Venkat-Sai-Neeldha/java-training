package day5;
import java.util.Scanner;

public class factorial {
	public static int fact(int num) {
		int container=1;
		for(int loop=1;loop<=num;loop++) {
			container*=loop;
		}
		return container;
	}
 public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter number for factorial");
	int num=scan.nextInt();
	
	System.out.println(fact(num));
	scan.close();
}
}

