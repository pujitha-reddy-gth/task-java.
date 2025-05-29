package com.inheritance;

public class Vehicle {
	public void describe() {
		System.out.println("This is a vehicle");
	}
}
	class Car extends Vehicle{
		public  void decribe() {
			super.describe();
			
			System.out.println("This is a car");
		}
	}
	
	
	

	