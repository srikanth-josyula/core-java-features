package com.methods.accessModifiers;

//A simple Java class with a public method
public class PublicClassExample {

	// Public method that can be accessed from anywhere
	public void displayMessage() {
		System.out.println("Hello, this is a public method!");
	}

	public static void main(String[] args) {
		PublicClassExample myObject = new PublicClassExample();
		myObject.displayMessage();
	}
}

