package com.methods.accessModifiers;

class DefaultClassExample {

	void displayMessage() {
		System.out.println("Hello, this is a protected method!");
	}

	public static void main(String[] args) {
		DefaultClassExample myObject = new DefaultClassExample();
		myObject.displayMessage();
	}
}