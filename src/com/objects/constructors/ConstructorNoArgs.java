package com.objects.constructors;

public class ConstructorNoArgs {

	// A constructor that has no parameter is known as the default constructor.
	// compiler creates a default constructor (with no arguments) for the class

	public static void main(String[] args) {
		ConstructorNoArgs noArgs = new ConstructorNoArgs();
		System.out.println(System.identityHashCode(noArgs));
	}
}
