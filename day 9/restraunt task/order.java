package pack2;
/**
 * @apiNote order class for orderid
 * */
public class order {
	  private  double orderId;
	  
	    
	    public order(double orderId) {
	        this.orderId = orderId;
	    
	    }
         /**
          *method to get order id
          **/
	    public double getOrderId() {
	        return orderId;
	    }
}
