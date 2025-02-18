package pack2;

/**
 * @author venkat
 * @apiNote customer class implementing Userinterface
 */

class customer implements userinterface{

	private String username;

	/**
	 *@return login details
	 */
	@Override
	
	public void login(String username,String password) {
		System.out.println("logged with user name"+username);
		
	}
      /**
       * @return registration details
       * 
       * **/
	@Override
	public void register(String username,String password) {
		System.out.println("registered with username"+username);
		
	}
    /**
     * @return user profile details
     * 
     * 
     * **/
	@Override
	public void viewProfile(String username) {
		System.out.println("your user profile"+username);
		
	}
	/**
	 * @return orders placed  details
	 * 
	 * **/

	@Override
	public void placeOrder() {
		System.out.println("place your order here");
		
	}
	/**
	 * @apiNote constructor for customer class
	 * **/
	public customer(String username,String password){
		this.username=username;
	
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

}
