package com.strings;

public class StringLiteralDemo {

	public static void main(String[] args) {

		// String literals
		String s1 = "Hello";
		String s2 = "Hello";
		String s3 = "World";

		// Checking reference equality
		System.out.println("s1 == s2: " + (s1 == s2)); // true

		// Concatenation
		String s4 = s1 + s3; // "HelloWorld", not pooled

		// Interning
		String s5 = s4.intern(); // Refers to "HelloWorld" in the pool if it exists
		System.out.println("s4 == s5: " + (s4 == s5)); // false, unless s4 is interned

		// Immutable behavior
		s1.concat(" World"); // "Hello World", s1 remains "Hello"
		System.out.println("s1: " + s1); // "Hello"

		//liternals used in switch from java 7
		String day = "Monday";
		switch (day) {
		case "Monday":
			System.out.println("Start of the week");
			break;
		// other cases
		}

		// Concatenation of primitive data type
		String result;
		result = "Hello" + 5;
		String unicodeString = "Hello \u263A"; // Unicode smiley face

		System.out.println(result); // Hello5
		System.out.println(unicodeString); // Hello ☺
	}

}
