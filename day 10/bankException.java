package day10exception;
import java.util.Scanner;
 class InsufficientBalance extends Exception{
	/**
	 * @author venkat
	 * @apiNote program to custom exception :bank withdrawl
	 */
	private static final long serialVersionUID = 1L;

	public  InsufficientBalance(String message) {
		super(message);
	}
}



public class bankException {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the balance");
		int bal=scan.nextInt();
		System.out.println("enter the withdraw amount");
		int withdraw=scan.nextInt();
		scan.close();
		try {
			if(bal<withdraw) {
				throw new InsufficientBalance("insufficient balance");
			}
			else {
				System.out.println("withdraw succesful");
			}
			
		}
		catch(InsufficientBalance e) {
			System.out.println(e.getMessage());
		}

	}

}
