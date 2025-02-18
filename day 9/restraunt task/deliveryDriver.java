package pack2;

/**
 * @author venkat
 * @apiNote delivery class implementing userinterface
 */
class deliveryDriver implements userinterface{

	private String username;

	
	/**
	 * @return login details
	 * **/
	@Override
	public void login(String username,String password) {
		System.out.println("login with username"+username);
		
	}
	/**
	 * @return registration details
	 * 
	 * **/
	@Override
	public void register(String username,String password) {
		System.out.println("register as a delivery partner with username"+username);
		
	}
     /**
      * @return profile details
      * **/
	@Override
	public void viewProfile(String username) {
		System.out.println("your delivery partner profile "+username);
		
	}
    /**
     * @return details of placed orders
     * **/
	@Override
	public void placeOrder() {
		System.out.println(" here u can see the placed orders alloted to you ");
		
	}
	/**
	 *@return user name from class
	 * 
	 * **/
	public  String getname() {
		return username;
	}
	/**
	 * sets method name
	 * **/
	public void setname(String username) {
		this.username= username;
	}
	
	/**
	 * @apiNote constructor for delivery driver class
	 * */
public deliveryDriver(String username,String password) {
	this.username=username;
}
}
