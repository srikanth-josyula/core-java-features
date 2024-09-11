package com.strings;

public class StringPoolDemo {
	public static void main(String[] args) {

		/**
		 * 1. String Literal
		 **/
		// String literals are stored in the String Pool.
		String literal1 = "abc";
		String literal2 = "abc";

		// Checking if both literals refer to the same memory location.
		System.out.println("String Literal:");
		System.out.println("literal1 == literal2: " + (literal1 == literal2)); // true
		System.out.println("literal1.equals(literal2): " + literal1.equals(literal2)); // true

		/**
		 * 2. Using new Keyword
		 **/
		// Using `new` keyword creates a new String object in heap space.
		String newString1 = new String("abc");
		String newString2 = new String("abc");

		// Checking if the new strings refer to the same memory location.
		System.out.println("\nUsing new Keyword:");
		System.out.println("newString1 == newString2: " + (newString1 == newString2)); // FALSE
		System.out.println("newString1.equals(newString2): " + newString1.equals(newString2)); // true

		/**
		 * 3. String Interning
		 * 
		 **/
		// Interning a string to see if it refers to the same pool instance.
		String stringObject = new String("Alex");
		String stringLiteral = stringObject.intern();

		System.out.println("\nString Interning:");
		System.out.println("stringObject == stringLiteral: " + (stringObject == stringLiteral)); // FALSE
		System.out.println("stringObject.equals(stringLiteral): " + stringObject.equals(stringLiteral)); // true

		// Interned string vs String literal
		String literal = "Alex";
		System.out.println("\nString Literal vs Interned String:");
		System.out.println("literal == stringLiteral: " + (literal == stringLiteral)); // true
		System.out.println("literal.equals(stringLiteral): " + literal.equals(stringLiteral)); // true

	}

}
