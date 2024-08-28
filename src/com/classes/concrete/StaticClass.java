package com.classes.concrete;

public class StaticClass {
	
	String outermsg = "OuterMSG";
	
	public static class StaticNestedClass {
		static String msg;

		StaticNestedClass(String message) {
			msg = message;
			System.out.println("Inside Constructor");
		}

		static void print() {
			System.out.println(msg);
		}
	}

	public static void main(String[] args) {
		// Instantiating the static nested class
		StaticClass.StaticNestedClass obj = new StaticClass.StaticNestedClass("Hello!");
		obj.print(); // Output will be "Hello!"
		
		
		//Static methods can be called without creating an instance of the class.
		StaticClass.StaticNestedClass.print();
	}
}
