package exception_Day11;
/**
 * @author venkat
 * @apiNote custom exception for insufficient funds:unchecked exception
 * */
public class InsufficientFundsException  extends RuntimeException{
	
	private static final long serialVersionUID = 1L;
    public InsufficientFundsException(String message) {
    	super(message);
    }
}
