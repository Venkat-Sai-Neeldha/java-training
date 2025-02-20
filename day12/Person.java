package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.Queue;
import java.util.Vector;
/**
 * @author venkat
 * @apiNote Class Person with variables
 * 
 * */
public class Person {
    String name;
    int age;
    String city;
    List <String> subjects;
    /**
     * Constructor for Person class
     * */
    public  Person(String name, int age, String city ,List<String> subjects) {
    	this.name=name;
    	this.age=age;
    	this.city=city;
    	this.subjects=new ArrayList<>(subjects);
    }
    /**
     * @return string with all variables
     * */
    public String toString() {
    	return "{Person name "+name+" age "+age+" city "+city+" Subjects "+subjects+"}";
    }
    /**
     * @apiNote main method for execution
     * */
	public static void main(String[] args) {
		  List<Person> List = new ArrayList<>();
		  
      Person person1=new Person("venkat",22,"hyderabad",Arrays.asList("maths","science"));
  	
      Person person2=new Person("sai",23,"hyderabad",Arrays.asList("Physics","science"));
  	
      Person person3=new Person("jagadhish",22,"hyderabad",Arrays.asList("social","science"));
      
      Person person4=new Person("venkat",22,"hyderabad",Arrays.asList("maths","science"));
    	
      Person person5=new Person("sai",23,"hyderabad",Arrays.asList("Physics","science"));
  	
      Person person6=new Person("jagadhish",22,"hyderabad",Arrays.asList("social","science"));
      /**
       * Arraylist operations
       * */
      List.add(person1);
      List.add(person2);
      List.add(person3);
      List.add(person4);
      List.add(person5);
      List.add(person6);
      
      List.remove(person3);
      
     System.out.println( List.get(2));
      
      System.out.println(List.indexOf(person6));
      System.out.println(List.contains(person4));
      System.out.println(List.reversed());
      System.out.println( List.subList(1, 3));
      
      /**
       * Hash set 
       * */
      Set<Person> Set1 = new HashSet<>(List);
      System.out.println(Set1.size());
      
      
      
      /**
       * Vector
       * */
      Vector<Person> vector=new Vector<>(List);
      
      System.out.println(vector.elementAt(2));
      
      
      
      /**
       * Queue
       * */
      Queue<Person> Queue = new LinkedList<>(List);
      System.out.println(Queue.isEmpty());
	}

}
