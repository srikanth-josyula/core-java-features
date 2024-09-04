package com.classes.interfaces;

public interface InterfaceDemoErrors {

	public InterfaceDemoErrors(){
		//ERROR - Interfaces cannot have constructors
	}

	// Abstract method (no body)
	void printSomething();

	// Default method (with a body)
	default void printDefault() {
		System.out.println("This is a Default Method inside Interface");
	}

	// Static method (with a body)
	static void printConstant() {
		System.out.println("Inside Static Method");
	}

	public static void main(String[] args) {
		
		//ERROR - Cannot instantiate the type InterfaceDemoErrors
		InterfaceDemoErrors impl = new InterfaceDemoErrors();
		
	}
	
	class InterfaceImpl implements InterfaceDemoErrors {
		
		//Failing to provide an implementation for the abstract method (COMPILE-TIME ERROR)
		
		// Incorrectly attempting to override a static method (COMPILE-TIME ERROR)
		@Override
		static void printConstant() {
			
		}
	}
}
