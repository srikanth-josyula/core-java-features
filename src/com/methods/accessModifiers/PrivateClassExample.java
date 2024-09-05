package com.methods.accessModifiers;

public class PrivateClassExample {

	// Public method that can be accessed from anywhere
	private void displayMessage() {
		System.out.println("Hello, this is a protected method!");
	}

	public static void main(String[] args) {
		ProtectedClassExample myObject = new ProtectedClassExample();
		myObject.displayMessage();
	}
}

class PrivateSubClass extends PrivateClassExample {

	public void showMessage() {
		displayMessage(); //ERROR - Private They are not visible to any other class, even subclasses.
	}
}