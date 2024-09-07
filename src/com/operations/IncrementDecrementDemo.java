package com.operations;

public class IncrementDecrementDemo {
	public static void main(String[] args) {

		// The variable is incremented before its value is used in the expression.
		// Prefix Increment (++)
		int x = 5;
		System.out.println("Initial x: " + x); // Output: 5
		int prefixResult = ++x; // Increment x first, then assign to prefixResult
		System.out.println("After prefix increment (++x): " + x); // Output: 6
		System.out.println("prefixResult: " + prefixResult); // Output: 6

		// The variable is incremented after its value is used in the expression.
		// Postfix Increment (++)
		int y = 5;
		System.out.println("\nInitial y: " + y); // Output: 5
		int postfixResult = y++; // Assign current value of y to postfixResult, then increment y
		System.out.println("postfixResult: " + postfixResult); // Output: 5
		System.out.println("After postfix increment (y++): " + y); // Output: 6

		//The variable is decremented before its value is used in the expression.	
		// Prefix Decrement (--)
		int a = 8;
		System.out.println("Initial a: " + a); // Output: 8
		int prefixDecResult = --a; // Decrement a first, then assign to prefixDecResult
		System.out.println("After prefix decrement (--a): " + a); // Output: 7
		System.out.println("prefixDecResult: " + prefixDecResult); // Output: 7

		//The variable is decremented after its value is used in the expression.
		// Postfix Decrement (--)
		int b = 8;
		System.out.println("\nInitial b: " + b); // Output: 8
		int postfixDecResult = b--; // Assign current value of b to postfixDecResult, then decrement b
		System.out.println("After postfix decrement (b--): " + b); // Output: 7
		System.out.println("postfixDecResult: " + postfixDecResult); // Output: 8

	}
}
