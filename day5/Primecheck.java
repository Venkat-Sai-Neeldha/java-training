package day5;

/**
 * 
 * @author venkat
 * @APINote this is a program to check primes
 * 
 * 
 * 
 * 
 * */
import java.util.Scanner;


public class Primecheck {

	public boolean checkprime(int num) {
		if(num<2) {
			return false;
		}
		for(int loop=2;loop<num;loop++) {
			if(num%loop==0) {
				break;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a number to check prime");
		int num=scan.nextInt();
		
         Primecheck object=new Primecheck();
        System.out.println(object.checkprime(num));
        scan.close();
	}

}
