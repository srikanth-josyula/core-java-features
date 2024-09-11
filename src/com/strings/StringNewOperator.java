package com.strings;

public class StringNewOperator {

	public static void main(String[] args) {
		String str1 = "World";       // Stored in the string pool
		String str2 = "World";       // Stored in the string pool
		String str3 = new String("World"); // New object created in the heap
		
		System.out.println(System.identityHashCode(str1)); //498931366
		System.out.println(System.identityHashCode(str2)); //498931366
		System.out.println(System.identityHashCode(str3)); //2060468723
		
		System.out.println(str1 == str3); // false, different objects
		System.out.println(str1 == str2); // true, same ref in pool
		
		
		/**
		 * Immutable Behavior 
		 **/
		String str = new String("Immutable");
		str = str.concat(" String");
		System.out.println(str); // Output: Immutable String
		
	}	
}
