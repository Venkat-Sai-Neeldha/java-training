package pack2;
/**
 * @apiNote payment gateway class for payment details
 * */
public class paymentGateway {
	 public static double calculateTotalAmount(order order) {
	        return order.getOrderId();
	    }
       /**
        * method for payment process 
        * */
	    public static void processPayment(order order) {
	 
	        System.out.println("Processing payment for Order ID " + order.getOrderId());
	    }
}
