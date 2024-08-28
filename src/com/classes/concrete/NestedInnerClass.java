package com.classes.concrete;

public class NestedInnerClass {

	private String outerField = "Outer field";

	// Instance method of the outer class
	public void outerMethod() {
		System.out.println("OuterClass method");
	}

	// Nested Inner Class
	public class InnerClass {

		private String innerField = "Inner field";

		// Instance method of the inner class
		public void innerMethod() {
			System.out.println("InnerClass method");
			System.out.println("Accessing outer class field: " + outerField); // Accessing outer class field
			outerMethod(); // Accessing outer class method
		}
	}

	// Main method to demonstrate the use of the inner class
	public static void main(String[] args) {
		// Create an instance of the outer class
		NestedInnerClass outer = new NestedInnerClass();

		// Create an instance of the inner class using the outer class instance
		NestedInnerClass.InnerClass inner = outer.new InnerClass();

		// Access inner class methods and fields
		inner.innerMethod();
		System.out.println(inner.innerField);
	}
}
