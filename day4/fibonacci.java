import java.util.Scanner;
/**
 * @author venkat
 * @apiNote this is a program to print fibonacci numbers
 * 
 * **/
public class fibonacci {

	public static void main(String[] args) {
		int firstno=-1;
		int secondno=1;
		int sum;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number");
		int number=scan.nextInt();
			while(true) {
			sum=firstno+secondno;
			if(sum<number) {
			if(sum%3==0 && sum%5==0) {
				System.out.println(sum+" :I am spiderman and ironman");
			}
			else if(sum%3==0) {
				System.out.println(sum+" :I am spiderman");
			}
			else if( sum%5==0) {
				System.out.println(sum+" :I am ironman");
			}
			else {
				System.out.println(sum+" : i am zero");
			}
			firstno=secondno;
			secondno=sum;
			
		}
			else {
				break;
			}
			
			}
		scan.close();	

	}

}
