package com.variables;

public class InstanceVariableExample {
	
	// Default value is null
	private int someInt; // Default value is 0
	private double someDouble; // Default value is 0.0

	// Instead of:
	// public String someString;

	// Use:
	private String someString;
	
	public String getSomeString() {
	    return someString;
	}

	public void setSomeString(String someString) {
	    this.someString = someString;
	}
	

	// block is executed before any constructor is called and this will be called on
	// every object creation
	// instance block
	{
		System.out.println("Inside Instance Block");
		this.someString = "instance_Block";
		System.out.println(someString); // instance_Block
	}

	// Constructor
	public InstanceVariableExample() {
		System.out.println("Inside Constructor");
		this.someString = "constructor";
		System.out.println(someString);
	}

	// Constructor to initialize instance variables
	public InstanceVariableExample(String someString, int someInt, double someDouble) {

		// Initialization using constructor
		this.someString = someString; // Works fine

		// String someString = "New"; // Compile-time error: variable someString is
		// already defined in the scope

		this.someInt = someInt;
		this.someDouble = someDouble;
	}

	public static void main(String[] args) {
		InstanceVariableExample ins = new InstanceVariableExample();
		System.out.println(ins.someString); // This is allowed in this context as it's within the same class.
		//Always use 
		System.out.println(ins.getSomeString()); //constructor

		System.out.println(this.someString); //Complie-Error: We cant view the instance variables unless Object is created 

		InstanceVariableExample ins1 = new InstanceVariableExample("Text", 25, 50000.0);
		System.out.println(ins1.someString);
		InstanceVariableExample ins2 = new InstanceVariableExample("Text2", 455, 150000.0);
		System.out.println(ins2.someString);

		
		 System.out.println(MyInterface.interfaceVar);  // Accessing interface variable
		 MyInterface.interfaceVar = 24; //Complie-Error : The final field MyInterface.interfaceVar cannot be assigned
	

	}

	// OUTPUT
	// Inside Instance Block
	// instance_Block
	// Inside Constructor
	// constructor
	// constructor
	// Inside Instance Block
	// instance_Block
	// Text
	// Inside Instance Block
	// instance_Block
	// Text2

}

interface MyInterface {
    int interfaceVar = 42;  // Implicitly public, static, and final
}

