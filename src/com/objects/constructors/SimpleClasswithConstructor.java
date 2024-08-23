package com.objects.constructors;

public class SimpleClasswithConstructor {

	// Constructor name must be the same as its class name
	public SimpleClasswithConstructor() {
		System.out.println("Inside Constructor");
		// A Constructor must have no explicit return type
	}

	public static void main(String[] args) {

		//Constructors are called only once at the time of Object creation 
		SimpleClasswithConstructor cons = new SimpleClasswithConstructor();
		
		System.out.println(System.identityHashCode(cons));

	}
}
