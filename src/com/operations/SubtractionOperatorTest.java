package com.operations;

public class SubtractionOperatorTest {
	public static void main(String[] args) {
		// Test 1: Basic Integer Subtraction
		int num1 = 10;
		int num2 = 7;
		int result = num1 - num2; // Expected: 3
		System.out.println("Test 1 - Integer Subtraction: " + result);

		// Test 2: Double Subtraction
		double double1 = 5.75;
		double double2 = 2.25;
		double doubleResult = double1 - double2; // Expected: 3.50
		System.out.println("Test 2 - Double Subtraction: " + doubleResult);

		// Test 3: Mixed Type Subtraction (int - double)
		int intVal = 20;
		double doubleVal = 4.5;
		double mixedResult = intVal - doubleVal; // Expected: 15.5
		System.out.println("Test 3 - Mixed Type Subtraction (int - double): " + mixedResult);

		// Test 4: Character Subtraction
		char char1 = 'D'; // ASCII value of 'D' is 68
		char char2 = 'A'; // ASCII value of 'A' is 65
		int charResult = char1 - char2; // Expected: 3 (68 - 65)
		System.out.println("Test 4 - Character Subtraction: " + charResult);

		// Test 5: Subtraction with Negative Result
		int negativeResult = num2 - num1; // Expected: -3 (7 - 10)
		System.out.println("Test 5 - Subtraction with Negative Result: " + negativeResult);

		// Test 6: Subtraction with large numbers
		long large1 = 1_000_000_000L;
		long large2 = 500_000_000L;
		long largeResult = large1 - large2; // Expected: 500_000_000
		System.out.println("Test 6 - Subtraction with Large Numbers: " + largeResult);

		// Error Case 1: Trying to subtract incompatible types (int - String)
		try {
			// int invalidSubtraction = num1 - "Hello"; // This would cause a compile-time
			// error
			System.out.println("Error Case 1 - Compile-time error: Incompatible types (int - String)");
		} catch (Exception e) {
			System.out.println("Error in Error Case 1: " + e.getMessage());
		}

		// Error Case 2: Subtracting incompatible object types (Object - int)
		Object obj = new Object();
		try {
			 int objSubtraction = obj - num1; // This would cause a compile-time error
			System.out.println("Error Case 2 - Compile-time error: Incompatible types (Object - int)");
		} catch (Exception e) {
			System.out.println("Error in Error Case 2: " + e.getMessage());
		}

		// Error Case 3: Subtracting null values (not directly possible in Java)
		Integer nullInt1 = null;
		Integer nullInt2 = null;
		try {
			int nullSubtraction = nullInt1 - nullInt2; // This will throw a NullPointerException
			System.out.println("Error Case 3 - Null Subtraction Result: " + nullSubtraction);
		} catch (NullPointerException e) {
			System.out.println("Error in Error Case 3: NullPointerException caught: " + e.getMessage());
		}

		// Test 7: Subtracting floating-point precision issues
		double precision1 = 0.1;
		double precision2 = 0.2;
		double precisionResult = precision2 - precision1; // Expected: 0.1 (but floating point precision may affect this)
		System.out.println("Test 7 - Floating Point Precision Subtraction: " + precisionResult);
	}
}
