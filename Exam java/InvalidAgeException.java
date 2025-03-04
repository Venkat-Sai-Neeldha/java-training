package exam;
/**
 * @author venkat
 * @apiNote invalid age custom exception
 * 
 * */
public class InvalidAgeException extends Exception {
 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public InvalidAgeException(String message) {
	 super(message);
 }
}
