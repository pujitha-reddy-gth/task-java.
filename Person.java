package com.inheritance;
class Person {
    String name;

    Person(String name) {
        this.name = name;
    }
}

class Student extends Person {
    String name; 

    Student(String personName, String studentName) {
        super(personName); 
        this.name = studentName;
    }

    void printNames() {
        System.out.println("Parent's name: " + super.name); 
        System.out.println("Child's name: " + this.name);  
    }
}

