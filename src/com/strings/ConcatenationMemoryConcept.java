package com.strings;

import java.util.StringJoiner;

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
		
		// Concatenate using String.format() method
       		String result4 = String.format("%s%s", s1, "b"); // Creates new string in the heap
      	 	String result5 = String.format("%s%s", "a", "b"); // Creates new string in the heap

		// Concatenate using String.join() method
		String result6 = String.join("", s1, s2); // Creates new string in the heap
		String result7 = String.join("", "a", "b"); // Creates new string in the heap
		
		StringJoiner result8 = new StringJoiner(", ");
		result8.add(s1);
		result8.add(s2);

		// Using String literal
		String result = "ab";
		System.out.println("HashCode of result4 (literal): " + System.identityHashCode(result)); //498931366 //SCP
		
		// Check hash codes
		System.out.println("HashCode of result1 (compile-time concat using '+'): " + System.identityHashCode(result1)); //498931366 //SCP
		System.out.println("HashCode of result2 (run-time concat using '+'): " + System.identityHashCode(result2)); //2060468723 //HEAP
		System.out.println("HashCode of result3 (run-time concat using .concat() method): " + System.identityHashCode(result3)); //622488023 //HEAP
		System.out.println("HashCode of result4 (using String.format()): " + System.identityHashCode(result4));  //112810359 //Heap
		System.out.println("HashCode of result5 (using String.format()): " + System.identityHashCode(result5)); //2124308362 //Heap
		
		System.out.println("HashCode of result6 (using String.join()): " + System.identityHashCode(result6));  //146589023 //Heap
		System.out.println("HashCode of result7 (using String.join()): " + System.identityHashCode(result7)); //1482968390 //Heap
		
		System.out.println("HashCode of result8 (using StringJoiner): " + System.identityHashCode(result8)); //349885916 //Heap
        

		// Check if the results are the same
		System.out.println("Are result1 and result2 the same object? " + (result1 == result2)); //false
	}
}
