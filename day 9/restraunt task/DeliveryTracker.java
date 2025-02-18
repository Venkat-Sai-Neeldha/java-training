package pack2;
/**
 * @author venkat
 * @apiNote interface class for delivery tracker class with empty methods
 * **/
public interface DeliveryTracker {
	void startDelivery(order order);
    void trackProgress(order order);
    void completeDelivery(order order);
}
   /**
    *
    * @apiNote realtime delivery tracker class implementing delivery tracker
    * 
    * */
 class RealTimeDeliveryTracker implements DeliveryTracker {
	 /**
	  * @return method for delivery started
	  * */
    @Override
    public void startDelivery(order order) {
        System.out.println("Real-time delivery started for Order ID: " + order.getOrderId());
    }
    /**
	  * @return method for delivery tracking
	  * */

    @Override
    public void trackProgress(order order) {
        System.out.println("Tracking real-time progress for Order ID: " + order.getOrderId());
    }
    /**
	  * @return method for delivery completed
	  * */
    @Override
    public void completeDelivery(order order) {
        System.out.println("Delivery completed for Order ID: " + order.getOrderId());
    }
}
