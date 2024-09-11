package com.strings;

public class ConcatenationMemoryConcept {

	public static void main(String[] args) {
		
		// Compile-time constants
		String s1 = "a"; // Stored in the SCP
		String s2 = " b";
	

		// Concatenate at compile-time
		String result1 = "a" + "b"; //stored in SCP
		
		// Concatenate at runtime
		String result2 = s1 + s2; //Stored at heap
		
		// Concatenate using .concat() method
		String result3 = s1.concat("b"); // Creates new string in the heap

		// Using String literal
		String result4 = "ab";

		// Check hash codes
		System.out.println("HashCode of result1 (compile-time concat using '+'): " + System.identityHashCode(result1)); //498931366 //SCP
		System.out.println("HashCode of result2 (run-time concat using '+'): " + System.identityHashCode(result2)); //2060468723 //HEAP
		System.out.println("HashCode of result3 (run-time concat using .concat() method): " + System.identityHashCode(result3)); //622488023 //HEAP
		System.out.println("HashCode of result4 (literal): " + System.identityHashCode(result4)); //498931366 //SCP

		// Check if the results are the same
		System.out.println("Are result1 and result2 the same object? " + (result1 == result2)); //false
	}
}
