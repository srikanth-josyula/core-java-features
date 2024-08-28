package com.classes.concrete;

public class MethodLocalInnerClass {

	private String outerField = "Outer field";

	// Instance method of the outer class
	public void outerMethod() {
		System.out.println("OuterClass method");

		// Local variable in the method
		final int localVar = 10;

		// Method-Local Inner Class
		class InnerClass {
			private String innerField = "Inner field";

			public void innerMethod() {
				System.out.println("InnerClass method");
				System.out.println("Accessing outer class field: " + outerField); // Accessing outer class field
				System.out.println("Accessing local variable: " + localVar); // Accessing local variable
				outerMethodFromInner(); // Accessing outer class method from inner class
			}
		}

		// Creating an instance of the method-local inner class
		InnerClass inner = new InnerClass();
		inner.innerMethod();
	}

	// Another method in the outer class
	public void outerMethodFromInner() {
		System.out.println("This is another method from the outer class");
	}

	// Main method to demonstrate the use of the method-local inner class
	public static void main(String[] args) {
		// Create an instance of the outer class
		MethodLocalInnerClass outer = new MethodLocalInnerClass();

		// Call the outer class method which defines and uses the method-local inner
		// class
		outer.outerMethod();
		
	}
}
