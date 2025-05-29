package com.inheritance;

public class Employee1 {

	Employee1(){
		System.out.println("Employee Creat");
	
	}

}
class Manager extends Employee1{
	Manager(){
		super();
	System.out.println("Manager Created");
}

	
	
}
