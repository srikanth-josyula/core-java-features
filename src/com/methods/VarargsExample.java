package com.methods;

public class VarargsExample {
	// Method using varargs
	public static void printNumbers(int... numbers) {
		System.out.println("Number of arguments: " + numbers.length);
		for (int num : numbers) {
			System.out.print(num + " ");
		}
		System.out.println();
	}

	// Method combining varargs with a regular parameter
	public static void printNamesAndCount(String description, String... names) {
		System.out.println(description + " (" + names.length + " names):");
		for (String name : names) {
			System.out.print(name + " ");
		}
		System.out.println();
	}

	// Overloaded method with varargs (to demonstrate caution with ambiguity)
	public static void display(String message) {
		System.out.println("Single String: " + message);
	}

	public static void display(String... messages) {
		System.out.println("Varargs String length: " + messages.length);
		for (String msg : messages) {
			System.out.print(msg + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// Passing multiple int arguments to varargs method
		printNumbers(1, 2, 3, 4, 5); // Number of arguments: 5

		// Passing an array to varargs method
		int[] numberArray = { 10, 20, 30 };
		printNumbers(numberArray); // Number of arguments: 3

		// Combining varargs with regular parameters
		printNamesAndCount("Students", "Alice", "Bob", "Charlie");

		// Calling overloaded methods
		display("Hello");
		display("Hi", "Hello", "Welcome"); // This will invoke the varargs version
	}
}
