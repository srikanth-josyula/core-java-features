package com.oops;

//Abstract class representing a general Vehicle
abstract class MainClass {
	// Abstract method (does not have a body)
	abstract void printSomething();

	// Concrete method
	void printSomething2() {
		System.out.println("printSomething2 Called.");
	}
}

//Concrete class that extends Vehicle
class SubClass extends MainClass {
	// Providing implementation for the abstract method
	@Override
	void printSomething() {
		System.out.println("printSomething from SubClass is called.");
	}
}

//Main class to test the abstraction
public class AbstractionExample {
	public static void main(String[] args) {
		
		MainClass cls = new SubClass();

		cls.printSomething();
		cls.printSomething2();
	}
}
