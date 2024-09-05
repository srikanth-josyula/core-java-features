package com.methods.overloading;

public class MethodOverloadingExample {

	// Method with no parameters
	public void printMessage() {
		System.out.println("No parameters");
	}

	// Method with one parameter (changing the number of parameters)
	public void printMessage(String message) {
		System.out.println("Message: " + message);
	}

	// Method with two parameters, both of different types (changing data types of arguments)
	public void printMessage(String message, int count) {
		System.out.println("Message: " + message + ", Count: " + count);
	}

	// Method with two parameters but different order (changing the order of
	// parameters)
	public void printMessage(int count, String message) {
		System.out.println("Count: " + count + ", Message: " + message);
	}

	public static void main(String[] args) {
		// Create an instance of the class
		MethodOverloadingExample example = new MethodOverloadingExample();

		// Call the overloaded methods
		example.printMessage(); // Calls method with no parameters
		example.printMessage("Hello, World!"); // Calls method with one parameter
		example.printMessage("Hello", 3); // Calls method with two parameters (different types)
		example.printMessage(3, "Hello"); // Calls method with two parameters (order changed)
	}
}
