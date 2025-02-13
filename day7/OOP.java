package com.package7;
/**
 * @author venkat
 * @apiNote this is a program to implement class ,attribute,method 
 * 
 * **/
public class OOP {
                           
	String model;                   //attributes
	int price;
	public void driving() {             // method
		System.out.println("I am driving");
	}
	public static void main(String[] args) {
		OOP car =new OOP();
		car.driving();
		car.price=10000;
		System.out.println(car.price);

	}

}
