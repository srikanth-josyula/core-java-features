package com.objects.constructors;

public class IllegalRecursiveConstructor {
	
	public IllegalRecursiveConstructor() {
		// Trying to call another constructor
		this(); // This would be invalid and cause an infinite loop
	}

	public IllegalRecursiveConstructor(int value) {
		// Some code here
	}

	public static void main(String[] args) {
		IllegalRecursiveConstructor obj = new IllegalRecursiveConstructor();
	}
}
