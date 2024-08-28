package com.classes.concrete;

public class FinalClassErrors extends Final_Class { // The type FinalClassErrors cannot subclass the final class
													// Base_Class

	@Override
	void Display() { // Methods in a final class cannot be overridden by subclasses. However, since
						// final classes cannot be subclassed, this rule is somewhat redundant for final
						// classes.
		System.out.println("Derived_Class::Display()");
	}

	public static void main(String[] args) {
		//Final classes can be instantiated like any other class. The final keyword only prevents inheritance.
		Final_Class bc = new Final_Class();  // This works fine Instantiating the final class Base_Class
		bc.Display();
		
		bc.value; //The field Base_Class.value is not visible
	}
}

final class Final_Class {

	private final String value = null;

	public Final_Class() {

	}

	void Display() {
		System.out.println("Final_Class::Display()");
	}
}
