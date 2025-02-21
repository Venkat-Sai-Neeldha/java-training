package collections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
public class Warehouse{
public static void main(String[] args) {
	
	Map <Integer,List<Product>> mapper=new HashMap<>();
	
	List<Product> inventory=new ArrayList<>();
	List <Product> inventory2=new ArrayList<>();
	List <Product> inventory3=new ArrayList<>();
	
	
	inventory.add(new Product(1,"shirt 1"));
	inventory.add(new Product(2,"shirt 2"));
	inventory.add(new Product(3,"shirt 3"));
	
	
	inventory2.add(new Product(1,"mobiles 1"));
	inventory2.add(new Product(2,"mobile 2"));
	inventory2.add(new Product(3,"mobiles 3"));
	inventory2.add(new Product(4,"mobile 4"));
	
	
	inventory3.add(new Product(1,"grocery1"));
	inventory3.add(new Product(2,"grocery2"));
	inventory3.add(new Product(3,"grocery3"));
	inventory3.add(new Product(4,"grocery4"));
	
	mapper.put(001, inventory);
	mapper.put(002, inventory2);
	mapper.put(003, inventory3);

	 Iterator<Map.Entry<Integer, List<Product>>> iterator = mapper.entrySet().iterator();
     
     while (iterator.hasNext()) {
         Map.Entry<Integer, List<Product>> entry = iterator.next();
         if (entry.getValue().isEmpty()) {
             iterator.remove();
         }
         else {
             System.out.println("Key: " + entry.getKey());
             for (Product product : entry.getValue()) {
                 System.out.println("  " + product);  // Print each product
             }
         }

     }
	       
	      
}

}