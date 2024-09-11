package com.strings;

public class StringBuilderExample {

	public static void main(String[] args) {

		/**
		 * 1. Create a StringBuilder instance (Different ways to create)
		 **/
		StringBuilder sb = new StringBuilder();
		System.out.println("Initial Capacity: " + sb.capacity()); // Output: 16

		StringBuilder sb1 = new StringBuilder(50);
		System.out.println("Initial Capacity: " + sb1.capacity()); // Output: 50

		StringBuilder sb2 = new StringBuilder("Hello, World!");
		System.out.println("Content: " + sb2.toString()); // Output: Hello, World!

		StringBuilder sb4 = new StringBuilder("Hello, CharSequence!");
		System.out.println("Content: " + sb4.toString()); // Output: Hello, CharSequence!

		/**
		 * 2. Checking initial Capacity and Increase
		 **/
		System.out.println("Length: " + sb.length()); // Output: 0
		System.out.println("Capacity: " + sb.capacity()); // Output: 16 (default capacity)

		sb.append("12345678901234567"); // Increased to 17 char
		System.out.println(sb.toString().toCharArray().length); // 17
		System.out.println("Capacity after exceeding: " + sb.capacity()); // Increased to 34

		/**
		 * 3. StringBuilder Methods
		 **/
		// Append various types of data
		sb.append("Hello"); // Append String
		sb.append(' '); // Append char
		sb.append(2024); // Append int
		sb.append(true); // Append boolean
		sb.append("!"); // Append another String
		sb.append(new Object()); // Append Object (calls toString() on the object)

		System.out.println("After appending data: " + sb.toString());
		// Output: Hello 2024true!java.lang.Object@<hashcode>

		// Insert a string at a specified position
		sb.insert(6, "Wonderful ");
		System.out.println("After insertion: " + sb.toString());
		// Output: Hello Wonderful 2024true!java.lang.Object@<hashcode>

		// Delete characters from a specific range
		sb.delete(17, 22); // Remove "2024t"
		System.out.println("After deletion: " + sb.toString());
		// Output: Hello Wonderful true!java.lang.Object@<hashcode>

		// Reverse the sequence
		sb.reverse();
		System.out.println("After reversing: " + sb.toString());
		// Output: @edocnahg.lavon ej taer!loudnorW olleH

		// Character manipulation
		char charAt5 = sb.charAt(5);
		System.out.println("Character at index 5: " + charAt5); // Output: 'd'

		// Set a character at a specific index
		sb.setCharAt(5, 'X');
		System.out.println("After setting character at index 5: " + sb.toString());
		// Output: @edocnahg.lavon ej X!loudnorW olleH

		// Replace part of the sequence
		sb.replace(10, 20, "REPLACEMENT");
		System.out.println("After replacement: " + sb.toString());
		// Output: @edocnahg.REPLACEMENT!loudnorW olleH

		// Convert to String
		String str = sb.toString();
		System.out.println("Converted to String: " + str);
		// Output: @edocnahg.REPLACEMENT!loudnorW olleH

		// Extract substring
		String substring = sb.substring(13, 26);
		System.out.println("Substring from index 13 to 26: " + substring);
		// Output: REPLACEMENT

		// Extract substring from start to end
		String substringFromStart = sb.substring(0);
		System.out.println("Substring from start: " + substringFromStart);
		// Output: @edocnahg.REPLACEMENT!loudnorW olleH

		// Extract subsequence
		CharSequence subseq = sb.subSequence(15, 25);
		System.out.println("Subsequence from index 15 to 25: " + subseq);
		// Output: !loudnorW

		StringBuilder sb5 = new StringBuilder("Hello, World! Welcome to Java.");

		int index1 = sb5.indexOf("World");
		System.out.println("Index of 'World': " + index1); // Output: 7

		int index2 = sb5.indexOf("Java");
		System.out.println("Index of 'Java': " + index2); // Output: 26

		int index3 = sb5.indexOf("NotFound");
		System.out.println("Index of 'NotFound': " + index3); // Output: -1
	}
}
