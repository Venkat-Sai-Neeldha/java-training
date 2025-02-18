package pack2;

/**
 * @author venkat
 * @apiNote main class for implementation
 */
public class Main {

	public static void main(String[] args) {
		// Create customers, restaurant, food items, etc.
        customer customer = new customer("johnDoe", "John Doe");
        restraunt restraunt = new restraunt("Pizza Place", "Street 1");
        fooditem pizza = new pizza("Cheese Pizza", 12.99, "Medium");
        //user login
       customer.getname();
        // Place an order
        order order = new order(123);
        customer.placeOrder();
        pizza.displayInfo();
         

        // Create a delivery driver and start delivery
        RealTimeDeliveryTracker driver = new RealTimeDeliveryTracker();
        
        driver.startDelivery(order);
        driver.trackProgress(order);
        driver.completeDelivery(order);

	}

}
