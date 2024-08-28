package com.classes.concrete;

public class AnonymousInnerClass {

	public static void main(String[] args) {

		// Creating an anonymous inner class that implements the Greeting interface
		SomeInterface greet = new SomeInterface() {
			@Override
			public void sayHello() {
				System.out.println("Hello from the anonymous inner class!");
			}
		};
		// Using the anonymous inner class
		greet.sayHello(); // Output: Hello from the anonymous inner class!
	}
}

interface SomeInterface {
	void sayHello();
}
