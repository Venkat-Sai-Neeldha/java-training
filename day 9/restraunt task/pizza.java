package pack2;
/**
 * @apiNote pizza class extending food item
 * */
public class pizza extends fooditem {

	  private String size;
		public pizza(String name, double price,String size) {
			super(name, price);
			this.size=size;
		
		}
		/**
		 * method for diplaying pizza details
		 * */
		public void displayInfo() {
	        System.out.println("Pizza Name: " + getName()+ ", Size: " + size);
		   
	   }

}
