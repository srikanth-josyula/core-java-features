package com.operations;

public class ArithmeticOperatorTest {
	public static void main(String[] args) {
		// Test 1: Basic Integer Addition
		int num1 = 5;
		int num2 = 7;
		int result = num1 + num2; // Expected: 12
		System.out.println("Test 1 - Integer Addition: " + result); // Output: 12

		// Test 2: String Concatenation
		String str1 = "Hello";
		String str2 = "World";
		String resultStr = str1 + " " + str2; // Expected: "Hello World"
		System.out.println("Test 2 - String Concatenation: " + resultStr);

		// Test 3: Mixed Type Addition (String + Integer)
		int number = 42;
		String text = "The answer is: ";
		String combined = text + number; // Expected: "The answer is: 42"
		System.out.println("Test 3 - Mixed Type Addition (String + Integer): " + combined);

		// Test 4: Concatenation with null String
		String nullStr = null;
		String nullConcat = "Hello" + nullStr; // Expected: "Hellonull" (Java converts null to "null")
		System.out.println("Test 4 - Concatenation with null String: " + nullConcat);

		// Test 5: Concatenation with an Object (Non-String)
		Object obj = new Object();
		String objConcat = "Object: " + obj; // Expected: Object.toString() is called
		System.out.println("Test 5 - Concatenation with Object: " + objConcat); // Object: java.lang.Object@1dbd16a6

		// Test 6: Integer + Double Addition
		int intVal = 10;
		double doubleVal = 3.14;
		double mixedAddition = intVal + doubleVal; // Expected: 13.14 (int is converted to double)
		System.out.println("Test 6 - Integer + Double Addition: " + mixedAddition);

		// Test 7: Concatenation of boolean
		boolean boolVal = true;
		String boolConcat = "Boolean value: " + boolVal; // Expected: "Boolean value: true"
		System.out.println("Test 7 - Concatenation of boolean: " + boolConcat);

		// Test 8: Character + Integer Addition
		char charVal = 'A'; // ASCII value of 'A' is 65
		int charAddition = charVal + 5; // Expected: 70 (65 + 5)
		System.out.println("Test 8 - Character + Integer Addition: " + charAddition);

		// Error Case 1: Trying to add incompatible types (e.g., int + String without assignment to String)
		try {
		    int invalidAddition = 5 + "Hello"; // This would cause a compile-time error
			System.out.println("Error Case 1 - Compile-time error: Incompatible types (int + String)");
		} catch (Exception e) {
			System.out.println("Error in Error Case 1: " + e.getMessage());
		}

		// Error Case 2: Null Object Concatenation
		Object nullObj = null;

		String nullObjConcat = "Null Object: " + nullObj; // Expected: "Null Object: null"
		System.out.println("Error Case 2 - Null Object Concatenation: " + nullObjConcat); // null

		// Error Case 3: Concatenation of incompatible primitive types without casting
		try {
			long invalidLong = 1000L + "Test"; // This would cause a compile-time error
			System.out.println("Error Case 3 - Compile-time error: Incompatible types (long + String)");
		} catch (Exception e) {
			System.out.println("Error in Error Case 3: " + e.getMessage());
		}
	}
}
