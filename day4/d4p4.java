package day4;
import java.util.Scanner;
public class d4p4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//taking user input
		System.out.println("enter marks  : ");
		int marks=sc.nextInt();
		
		//generating boolean value for switch using if else ladder
		String caselabel="";
		if(marks>=90 && marks<=100) {
			caselabel="A";
		}
		else if(marks>=80 && marks<90) {
			caselabel="B";
		}
		else if(marks>=70 && marks<80) {
			caselabel="C";
		}
		else if(marks>=60 && marks<70) {
			caselabel="D";
		}
		else if(marks>=0 && marks<60) {
			caselabel="F";
		}
		else {
			caselabel="invalid";
		}
		
		//switch conditon for grading
		switch(caselabel) {
		case "A":
			System.out.println("Grade A");
			break;
		case "B":
			System.out.println("Grade B");
			break;
		case "C":
			System.out.println("Grade C");
			break;
		case "D":
			System.out.println("Grade D");
			break;
		case "F":
			System.out.println("Fail");
			break;
		default:
			System.out.println(" please enter valid input");
			break;
			
		}
		sc.close();
		
	}

}
