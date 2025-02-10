package day5;
/**
 * @author venkat
 * @APINote thi is a program to convert celcius to farenheit
 * 
 * */

import java.util.Scanner;
public class Cel_to_Faren {
	public static double converter(double value) {
		return value*(9/5)+32;
	}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the value in celcius");
		double num=scan.nextDouble();
		//formula :F = (°C × 9/5) + 32
        System.out.println("the value of "+num+" celcius in farenheit is "+converter(num));
        scan.close();
	}

}
