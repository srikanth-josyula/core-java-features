package com.strings;

public class ConcatenationMemoryConcept {

	public static void main(String[] args) {
		// Compile-time constants
		String s1 = "a";
		String s2 = " b";

		// Concatenate at compile-time
		String result1 = "a" + "b"; //stored in SCP
		
		// Concatenate at runtime
		String result2 = s1 + s2; //Stored at heap

		// Using String literal
		String result3 = "ab";

		// Check hash codes
		System.out.println("HashCode of result1: " + System.identityHashCode(result1)); //498931366
		System.out.println("HashCode of result2: " + System.identityHashCode(result2)); //2060468723
		System.out.println("HashCode of result2: " + System.identityHashCode(result3)); //498931366

		// Check if the results are the same
		System.out.println("Are result1 and result2 the same object? " + (result1 == result2)); //false
	}
}
