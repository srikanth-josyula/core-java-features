package com.strings;

public class StringConcatenationPrimitives {
	public static void main(String[] args) {
		// Case 1: Integer concatenation with strings
		int a = 50;
		int b = 30;
		String str1 = a + b + "Hello" + 40 + 40;
		System.out.println("Case 1: " + str1); // Output: 80Hello4040

		// Case 2: String concatenation with primitive values
		String str2 = "Value: " + 100 + 200;
		System.out.println("Case 2: " + str2); // Output: Value: 100200

		// Case 3: Mixed types in different orders
		String str3 = 10 + 20 + "Result" + 30 + 40;
		System.out.println("Case 3: " + str3); // Output: 30Result3040

		// Case 4: String concatenation with characters
		String str4 = 'A' + 'B' + " is for Alphabet";
		System.out.println("Case 4: " + str4); // Output: 131 is for Alphabet

		// Case 5: String concatenation with floating-point numbers
		String str5 = 5.5 + 4.5 + " is the sum";
		System.out.println("Case 5: " + str5); // Output: 10.0 is the sum

		// Case 6: String concatenation with boolean values
		String str6 = "Boolean values: " + true + false;
		System.out.println("Case 6: " + str6); // Output: Boolean values: truefalse

		// Case 7: Precedence of operators in concatenation
		String str7 = "Result: " + 5 + 5 * 2;
		System.out.println("Case 7: " + str7); // Output: Result: 510
	}
}
