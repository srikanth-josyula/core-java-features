package com.methods.accessModifiers;

public class ProtectedClassExample {

	// Public method that can be accessed from anywhere
	protected void displayMessage() {
		System.out.println("Hello, this is a protected method!");
	}

	public static void main(String[] args) {
		ProtectedClassExample myObject = new ProtectedClassExample();
		myObject.displayMessage();
	}
}

class SubClass extends ProtectedClassExample {

	// Method in SubClass to access the protected method of SuperClass
	public void showMessage() {
		// Accessing the protected method from the superclass
		displayMessage();
	}
}