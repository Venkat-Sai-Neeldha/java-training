package pack2;

/**
 * @author venkat
 * @apiNote
 */
class restraunt implements userinterface{

	private String username;

	@Override
	public void login(String username,String password) {
		System.out.println("login with username"+username);
		
	}

	@Override
	public void register(String username,String password) {
		System.out.println(" register as a restraunt with username"+username);
		
	}

	@Override
	public void viewProfile(String username) {
		System.out.println("your restraunt profile with username"+username);
		
	}

	@Override
	public void placeOrder() {
		System.out.println("view orders placed from your restraunt");
		
	}
	public restraunt(String username,String password) {
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
