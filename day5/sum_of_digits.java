package day5;
import java.util.Scanner;
public class sum_of_digits {

	public int sum(int num) {
		int value=0;
		while(num!=0) {
		    int rem=num%10;
		    value=value+rem;
		    num=(num/10);
		    
		}
		return value;
	}
	
	public static void main(String[] args) {
	sum_of_digits object=new sum_of_digits();
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the number :");
	int val=scan.nextInt();
	System.out.println("the sum of digits of " +val+" is "+object.sum(val));
		scan.close();

	}

}
