package exception_Day11;
/**
 * @author venkat
 * @apiNote custom exception for invalid amount:checked exception
 * */
public class InvalidAmountException extends Exception{
	
	private static final long serialVersionUID = 1L;
	
	public InvalidAmountException(String message) {
		super(message);
		
	}
}
