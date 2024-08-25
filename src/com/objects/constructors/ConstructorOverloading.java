package com.objects.constructors;

public class ConstructorOverloading {

	public ConstructorOverloading() {
		System.out.println("Inside Empty Constructor");
	}

	public ConstructorOverloading(String msg) {
		System.out.println("Inside String Constructor " + msg);
	}

	public ConstructorOverloading(int i, String msg) {
		System.out.println("Inside String Constructor " + msg + " and " + i);
	}

	public static void main(String[] args) {

		ConstructorOverloading cons = new ConstructorOverloading();
		ConstructorOverloading cons1 = new ConstructorOverloading("Jello");
		ConstructorOverloading cons2 = new ConstructorOverloading(1, "Hello");

		System.out.println(System.identityHashCode(cons));
		System.out.println(System.identityHashCode(cons1));
		System.out.println(System.identityHashCode(cons2));

	}

	// Output
	/***
	 * Inside Empty Constructor 
	 * Inside String Constructor Jello 
	 * Inside String Constructor Hello and 1 
	 * 140435067 
	 * 1450495309 
	 * 1670782018
	 * 
	 */
}
