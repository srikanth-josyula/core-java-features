package com.strings;

public class StringVsCharArray {

	public static void main(String[] args) {
		/**
		 * 1. Immutable vs Mutable
		 **/
		// String is immutable: once created, the value cannot be changed.
		String str = "Hello";
		str.concat(" World");
		System.out.println("String after concat (immutable): " + str); // "Hello" - Original string remains unchanged

		// Char array is mutable: individual characters can be modified.
		char[] charArray = { 'H', 'e', 'l', 'l', 'o' };
		charArray[0] = 'Y';
		System.out.println("Char array after modification (mutable): " + new String(charArray)); // "Yello"

		/**
		 * 2. Memory Efficiency
		 **/
		// String literals are stored in the String pool (interning), meaning multiple
		// same strings refer to the same memory.
		String str1 = "Hello";
		String str2 = "Hello";
		System.out.println("Are str1 and str2 the same object? " + (str1 == str2)); // true
		System.out.println(System.identityHashCode(str1)); // 498931366
		System.out.println(System.identityHashCode(str2)); // 498931366

		// Char arrays are not stored in the pool, so each new char array is a different
		// object.
		char[] charArray1 = { 'H', 'e', 'l', 'l', 'o' };
		char[] charArray2 = { 'H', 'e', 'l', 'l', 'o' };
		System.out.println("Are charArray1 and charArray2 the same object? " + (charArray1 == charArray2)); // false
		System.out.println(System.identityHashCode(charArray1)); // 2060468723
		System.out.println(System.identityHashCode(charArray2)); // 622488023

		/**
		 * 3. Security
		 **/
		// Sensitive data (e.g., passwords) should not be stored in String because
		// Strings are immutable and stored in memory until garbage collected.
		// and even if you set a String reference to null, the original data may still
		// reside in memory until garbage collection.
		// Char arrays can be modified and erased once done.
		String sensitiveString = "Password123";
		char[] sensitiveCharArray = { 'P', 'a', 's', 's', 'w', 'o', 'r', 'd', '1', '2', '3' };

		// Example: Clearing sensitive data in char array
		for (int i = 0; i < sensitiveCharArray.length; i++) {
			sensitiveCharArray[i] = '\0'; // Null character to "clear" the array
		}
		System.out.println("Cleared char array: " + new String(sensitiveCharArray)); // Output will be empty or null
																						// characters

		/**
		 * 4. Performance
		 **/
        // String is immutable, so concatenating strings creates a new object every time.
        long startStringTime = System.currentTimeMillis();
        String testString = "";
        for (int i = 0; i < 1000; i++) {
            testString += "a"; // This is inefficient because it creates a new String every time
        }
        long endStringTime = System.currentTimeMillis();
        System.out.println("Time taken for String concatenation: " + (endStringTime - startStringTime) + " ms"); //2 ms
        
        // Using StringBuilder for efficient string concatenation (mutable)
        long startStringBuilderTime = System.currentTimeMillis();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 1000; i++) {
            stringBuilder.append("a");
        }
        long endStringBuilderTime = System.currentTimeMillis();
        System.out.println("Time taken for StringBuilder concatenation: " + (endStringBuilderTime - startStringBuilderTime) + " ms"); //0.1 ms
        
        // Char array manipulation (slightly faster than direct String concatenation but less flexible than StringBuilder)
        long startCharArrayTime = System.currentTimeMillis();
        char[] testCharArray = new char[1000];
        for (int i = 0; i < 1000; i++) {
            testCharArray[i] = 'a';
        }
        long endCharArrayTime = System.currentTimeMillis();
        System.out.println("Time taken for char array modification: " + (endCharArrayTime - startCharArrayTime) + " ms"); //0.8 ms
        
        
        /**
		 * 5. Conversions
		 **/
        // Convert String to Char Array
        String strToConvert = "Convert me";
        char[] convertedCharArray = strToConvert.toCharArray();
        System.out.println("String to char array: " + new String(convertedCharArray)); // "Convert me"
        
        // Convert Char Array to String
        char[] arrayToConvert = {'C', 'o', 'n', 'v', 'e', 'r', 't'};
        String convertedString = new String(arrayToConvert);
        System.out.println("Char array to String: " + convertedString); // "Convert"
        
    }
	
}
