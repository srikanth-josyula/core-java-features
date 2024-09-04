package com.classes.interfaces;

//Define a functional interface
@FunctionalInterface
interface FunctionalInterfaceExample {
	
	// Abstract method (functional method)
	void printSomething(String name);

	// Optional: default method
	default void printHello() {
		System.out.println("Hello!");
	}

	// Optional: static method
	static void printStatic() {
		System.out.println("Greetings from Greeting interface!");
	}
}

public class FunctionalInterfaceDemo {
	
	public static void main(String[] args) {
		
		// Using a lambda expression to implement the functional interface
		FunctionalInterfaceExample example = (name) -> System.out.println("Hello, " + name + "!");

		// Call the abstract method implemented by the lambda expression
		example.printSomething("printSomething");

		// Call the default method from the functional interface
		example.printHello();

		// Call the static method from the functional interface
		FunctionalInterfaceExample.printStatic();
	}
}
