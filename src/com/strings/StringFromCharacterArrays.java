package com.strings;

public class StringFromCharacterArrays {

	public static void main(String[] args) {
		
		// 1. Basic Character Array to String
		char[] charArray1 = { 'H', 'e', 'l', 'l', 'o' };
		String str1 = new String(charArray1); // Entire char array to String
		System.out.println("String from charArray1: " + str1); // Output: Hello

		// Consideration: Copies the entire character array into the String object.
		// Useful when you need to convert the whole array to a String.

		// 2. Partial Character Array to String
		char[] charArray2 = { 'J', 'a', 'v', 'a', ' ', 'L', 'a', 'n', 'g' };
		String str2 = new String(charArray2, 5, 4); // Extracts "Lang"
		System.out.println("String from charArray2 (partial): " + str2); // Output: Lang

		// Consideration: Only copies the specified range of characters from the array.
		// Memory-efficient and avoids copying unnecessary characters from large arrays.

		// 3. Using String.valueOf(char[]) for creating a String from char array
		char[] charArray3 = { 'P', 'r', 'o', 'g', 'r', 'a', 'm' };
		String str3 = String.valueOf(charArray3); // Same as new String(charArray3)
		System.out.println("String using valueOf: " + str3); // Output: Program

		// Consideration: This method is syntactic sugar for `new String(char[])` but
		// sometimes preferred for readability.
		// Both create a new String object from the given char array.

		// 4. Partial Array with String.valueOf(char[], offset, count)
		char[] charArray4 = { 'C', 'o', 'm', 'p', 'u', 't', 'e', 'r' };
		String str4 = String.valueOf(charArray4, 2, 4); // Extracts "mput"
		System.out.println("Partial String using valueOf: " + str4); // Output: mput

		// 5. Handling Special Characters
		char[] specialChars = { 'S', 'p', 'e', 'c', 'i', 'a', 'l', '\u00A9' };
		String str5 = new String(specialChars); // Converts char array with special characters
		System.out.println("String with special character: " + str5); // Output: Special©

		// Consideration: Character arrays can hold Unicode characters, so special
		// characters can be used.

		// 6. Empty Character Array
		char[] emptyArray = {};
		String str6 = new String(emptyArray); // Creates an empty string
		System.out.println("String from empty char array: '" + str6 + "'"); // Output: ''

		// 7. Null Character Array (Causes NullPointerException)
		// char[] nullArray = null;
		// String str7 = new String(nullArray); // Uncomment to see NullPointerException

		// Consideration: Creating a string from a null char array throws a
		// NullPointerException.
		// Always check if the array is null before creating a String.

		// 8. Modifying the char array after creating a String
		char[] mutableArray = { 'T', 'e', 's', 't' };
		String str8 = new String(mutableArray); // Creates a String
		mutableArray[0] = 'B'; // Modifies the original char array
		System.out.println("Modified char array: " + new String(mutableArray)); // Output: Best
		System.out.println("Original String remains unchanged: " + str8); // Output: Test

		// Consideration: The string remains immutable even if the original char array
		// is modified.

		// 9. Conversion using CharSequence API
		StringBuilder builder = new StringBuilder();
		builder.append(charArray1); // Appends the char array
		String str9 = builder.toString(); // Converts to String
		System.out.println("String from StringBuilder: " + str9); // Output: Hello

		// Consideration: StringBuilder is useful for building strings efficiently,
		// especially in loops.

		// 10. char[] in combination with StringBuilder for efficiency
		char[] largeArray = new char[1000];
		for (int i = 0; i < largeArray.length; i++) {
			largeArray[i] = (char) ('a' + i % 26); // Fills array with repeating letters
		}
		String largeString = new String(largeArray); // Large string created from char array
		System.out.println("Large string length: " + largeString.length()); // Output: 1000

		// Consideration: Direct conversion from large char arrays to String is fast and
		// memory-efficient.

	}
}
