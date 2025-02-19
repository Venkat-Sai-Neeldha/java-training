package exception_Day11;

/**
 * @author venkat
 * @apiNote custom exception for invalid account :checked exception
 * */
public class InvalidAccountException  extends Exception{
	
	private static final long serialVersionUID = 1L;
	public InvalidAccountException(String message) {
		super(message);
	}
}
