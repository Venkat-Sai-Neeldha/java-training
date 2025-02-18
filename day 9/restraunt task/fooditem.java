package pack2;
/**
 * @author venkat
 * @apiNote abstract class fooditem for fooditem details
 * */
public abstract class fooditem {
	private String name;
	private double price;
  /**
   * @apiNote constructor for abstract class
   * */
	public fooditem(String name, double price) {
		this.name=name;
		this.price=price;
		
	}
	 /**
	  * @apiNote abstract method
	  * */
	public abstract void displayInfo(); // Display info of the food item
        /**
         * getter method for price
         * */
    public double getPrice() {
        return price;
    }
    /**
     * getter method for name
     * */
    public String getName() {
        return name;
        }
   }
