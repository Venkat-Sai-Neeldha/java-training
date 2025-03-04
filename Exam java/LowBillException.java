package exam;
/**
 * @author venkat
 * @apiNote low bill custom exception 
 * 
 * */
public class LowBillException extends Exception {
  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public LowBillException(String message) {
	  super(message);
  }
}
