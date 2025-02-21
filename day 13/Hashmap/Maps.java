package collections;

import java.util.HashMap;

public class Maps {

	public static void main(String[] args) {
		HashMap<String,Session> mapper=new HashMap<>();
		
		/**
		 * adding a hashmap data
		 * */
		
         mapper.put("001", new Session("venkat","active session"));
         mapper.put("002", new Session("sai","not active"));
         mapper.put("003", new Session("dhanush","active session"));
         mapper.put("004", new Session("chandu","active session"));
         mapper.put("005", new Session("jagan","not active"));
         
         /**
          * hashmap methods
          * */
        System.out.println( mapper.size());
        
        System.out.println(mapper.entrySet());
        /**
         * set of keys */
        System.out.println(mapper.keySet());
        
        /**
         * set of values
         * */
       System.out.println( mapper.values());
       
       
       /**
        * removes element and prints
        * */
       System.out.println(mapper.remove("005"));
	}

}
