package com.classes.interfaces;

public interface InterfaceDemo {

	// Constant field (implicitly public, static, final)
	final static String CONSTANT = "constant_value";

	// Abstract method (no body)
	void printSomething();

	// Default method (with a body)
	default void printDefault() {
		System.out.println("This is a Default Method inside Interface");
	}

	// Static method (with a body)
	static void printConstant() {
		System.out.println("Category: " + CONSTANT);
	}

	public static void main(String[] args) {
		
		InterfaceImpl impl = new InterfaceImpl();
		impl.printSomething(); //Implementation of Interface

		impl.printDefault(); //This is a Default Method inside Interface
		//If we uncomment the impl default method we will get the implementatin response
		
		// Calling static method from the interface (CORRECT USAGE)
		InterfaceDemo.printConstant();

	}

	class InterfaceImpl implements InterfaceDemo {

		// Providing a concrete implementation of the abstract method
		@Override
		public void printSomething() {
			System.out.println("Implementation of Interface");

		}

		// Optionally overriding the default method
		/*@Override
		public void printDefault() {
			System.out.println("This is a Default Method inside Implementation");
		}*/
	}
}
