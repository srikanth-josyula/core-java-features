package com.classes.concrete;

public static class StaticClassErrors { // only nested classes (classes defined within another class) can be declared as
									// static. Top-level classes cannot be marked as static

	String outermsg = "OuterMSG";

	public static class StaticNestedClass {
		static String msg;

		StaticNestedClass(String message) {
			msg = message;
			System.out.println("Inside Constructor");
		}

		static void print() {
			System.out.println(msg);
			System.out.println(outermsg); // Cannot make a static reference to the non-static field outermsg
		}
	}

	public static void main(String[] args) {
		// Instantiating the static nested class
		StaticClassErrors.StaticNestedClass obj = new StaticClassErrors.StaticNestedClass("Hello!");
		obj.print(); // Output will be "Hello!"

		// Static methods can be called without creating an instance of the class.
		StaticClassErrors.StaticNestedClass.print();
	}
}

//Trying to extend the static nested class from outside
class StaticClassError extends StaticClassErrors.StaticNestedClass {

	StaticClassError(String message) {
		super(message);
	}

	@Override
	public void print() { //The method print() of type StaticClassError must override or implement a supertype method
		super.print();
	}

	public static void main(String[] args) {
		StaticClassError instance = new StaticClassError(msg);
		instance.print();
	}
}
