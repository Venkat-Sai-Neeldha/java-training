package exception_Day11;
/**
 * @author venkat
 * @apiNote class for bank account details
 */
public class Bankaccount {
      private int accountnumber;
      private int balance;
      
    /**
     * @apiNote getter and setter methods for bank account variables
     * */
  public  int  getAccountNumber() {
	  return accountnumber;
  }
  
  public void setAccountNumber(int accountnumber) {
	  this.accountnumber=accountnumber;
  }
  
  public  int  getBalance() {
	  return balance;
  }
  
  public void setBalance(int balance) {
	  this.balance=balance;
  }
  
  /**
   * @return deposit method to update balance
 * @throws InvalidAmountException 
   * */
  public void deposit(int amt ) throws InvalidAmountException {
	  if(amt<0) {
		  throw new InvalidAmountException("amount cannot be negative");
	  }
	  else {
	  balance=balance+amt;
	  }
  }
  
  /**
   * @return withdraw method to update the balance
 * @throws InvalidAmountException 
   * */
  public void withdraw(int amount) throws InvalidAmountException {
	  if(amount>balance) {
		  throw new InsufficientFundsException("insufficient funds to withdraw");
	  }
	  else {
	  balance=balance-amount;
	  }
  }
  /**
   *@return returns balance amount in account 
   * */
  public int checkBalance() {
	  return balance;
  }
  /**
   * constructor for Bank account class
   * */
  public Bankaccount(int accountnumber,int balance) {
	  this.accountnumber=accountnumber;
	  this.balance=balance;
  }
}
