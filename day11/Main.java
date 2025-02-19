package exception_Day11;
import java.util.Scanner;

/**
 * @author venkat
 * @apiNote Main class for execution
 */
public class Main {
	
public static void main(String[] args)  {
	Scanner scan=new Scanner(System.in);
	Bankaccount bank1=new Bankaccount(001,0);
	Bankaccount bank2=new Bankaccount(002,0);
	/**
	 * user input for account number validation
	 * */
	System.out.println("enter your bank account number");
	try {
	int accnumber=scan.nextInt();
	/**
	 * creating new object for bankaccount class and assigning null value;
	 * */
	Bankaccount account=null;
	if(accnumber==bank1.getAccountNumber()) {
		account=bank1;
	}
	else if(accnumber==bank2.getAccountNumber()) {
		account=bank2;
	}
	else {
		throw new InvalidAccountException("enter valid account number");
	}
	System.out.println("Select an option:");
    System.out.println("1. Deposit");
    System.out.println("2. Withdraw");
    System.out.println("3. Check Balance");
    System.out.println("4. Exit");
    System.out.print("Enter your choice: ");
    int choice = scan.nextInt();
    /**
     * validating user choice
     * */
    switch(choice) {
    case 1:
    	try {
    		System.out.println("enter amount to deposit");
    		int amt=scan.nextInt();
    		account.deposit(amt);
    		System.out.println("amount deposited");
    		}
    	catch(InvalidAmountException e) {
    		System.out.println(e.getMessage());
    		
    	}
    	break;
    case 2:
    	try {
    		System.out.println("enter amount to withdraw");
    		int amt=scan.nextInt();
    		account.withdraw(amt);
    		System.out.println("withdraw completed");
    	}
    	catch(InsufficientFundsException | InvalidAmountException e) {
    		System.out.println(e.getMessage());
    	}
    	break;
    case 3:
    	 account.checkBalance();
    	 break;
    case 4:
    	System.out.println("exit from bank services");
    	break;
    default:
    	System.out.println("invalid choice");
    	  
    	}
    }
	catch(InvalidAccountException e) {
		System.out.println(e.getMessage());
	}
	finally {
		scan.close();
	}
}
}
