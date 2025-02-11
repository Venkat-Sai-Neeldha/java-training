

import java.util.Scanner;

public class Multiplication_table {

	public static void main(String[] args) {
		//multiplication table of a number
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the value for multiplication table");
        int value=scan.nextInt();
		for(int i=1;i<=10;i++) {
			//break statement
			if(value*i>50) {
				break;
			}
			//continue statement
			else if((value*i)%3==0){
				continue;
			}
			else {
               System.out.println(value+" * "+i+" = "+value*i);
			}
	}
    scan.close();

	}

}
