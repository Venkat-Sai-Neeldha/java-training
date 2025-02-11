import java.util.Scanner;
/**
 * @author venkat
 * @apiNote this is a program to print numbers divisible by 2,3
 * **/
public class divisibility {

	public static void main(String[] args) {
		// taking user input
				Scanner scan =new Scanner(System.in);
				System.out.println("enter the number :");
				int number= scan.nextInt();
				
				//writing a for loop
				for(int outer=1;outer<=number;outer++) {
					//condition for divisibility
					if( outer%5!=0 && outer%2==0) {
						System.out.println(outer);
					}
					else if( outer%5!=0 && outer%3==0) {
						System.out.println(outer);
					}
					//skip divisible by 5
					else if(outer%5==0) {
						continue;
					}
				}
				scan.close();

	}

}
