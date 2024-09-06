package com.operations;

public class ModulusOperatorTest {
	
	public static void main(String[] args) {
		// Test 1: Basic Integer Modulus
		int num1 = 10;
		int num2 = 3;
		int modResult = num1 % num2; // Expected: 1 (10 divided by 3 leaves a remainder of 1)
		System.out.println("Test 1 - Integer Modulus: " + modResult);

		// Test 2: Modulus with Zero Remainder
		int num3 = 8;
		int num4 = 4;
		int modZero = num3 % num4; // Expected: 0 (8 divided by 4 has no remainder)
		System.out.println("Test 2 - Modulus with Zero Remainder: " + modZero);

		// Test 3: Double Modulus
		double double1 = 9.75;
		double double2 = 2.5;
		double doubleModResult = double1 % double2; // Expected: 2.25 (remainder of 9.75 / 2.5)
		System.out.println("Test 3 - Double Modulus: " + doubleModResult);

		// Test 4: Mixed Type Modulus (int % double)
		double mixedModResult = num1 % double2; // Expected: 0.5 (remainder of 10 / 2.5)
		System.out.println("Test 4 - Mixed Type Modulus (int % double): " + mixedModResult);

		// Test 5: Modulus with Negative Numbers
		int negativeMod = -10 % 3; // Expected: -1 (-10 divided by 3 leaves a remainder of -1)
		System.out.println("Test 5 - Modulus with Negative Numbers: " + negativeMod);

		// Test 6: Modulus of Zero
		int zeroMod = 0 % num2; // Expected: 0 (0 divided by any number leaves a remainder of 0)
		System.out.println("Test 6 - Modulus of Zero: " + zeroMod);

		// Test 7: Modulus with Division by Zero (Integer)
		try {
			int modByZero = num1 % 0; // Expected: ArithmeticException (division by zero)
			System.out.println("Test 7 - Modulus with Division by Zero (Integer): " + modByZero);
		} catch (ArithmeticException e) {
			System.out.println("Error in Test 7 - Modulus with Division by Zero (Integer): " + e.getMessage());
		}

		// Test 8: Modulus with Division by Zero (Double)
		try {
			double modByZeroDouble = double1 % 0.0; // Expected: NaN (Not-a-Number)
			System.out.println("Test 8 - Modulus with Division by Zero (Double): " + modByZeroDouble);
		} catch (ArithmeticException e) {
			System.out.println("Error in Test 8 - Modulus with Division by Zero (Double): " + e.getMessage());
		}

		// Test 9: Checking for Even or Odd Numbers using Modulus
		int evenNumber = 24;
		int oddNumber = 13;
		System.out.println("Test 9 - Even Check: " + evenNumber + " is " + (evenNumber % 2 == 0 ? "Even" : "Odd"));
		System.out.println("Test 9 - Odd Check: " + oddNumber + " is " + (oddNumber % 2 == 0 ? "Even" : "Odd"));

		// Test 10: Cycling through a Range (Modulo Cycling)
		int range = 5;
		for (int i = 0; i < 10; i++) {
			int cycleValue = i % range; // Cycles values within the range 0 to 4
			System.out.println("Test 10 - Cycle Value for " + i + ": " + cycleValue);
		}

		// Error Case 1: Trying to use modulus with incompatible types (int % String)
		try {
			 int invalidMod = num1 % "Hello"; // This would cause a compile-time error
			System.out.println("Error Case 1 - Compile-time error: Incompatible types (int % String)");
		} catch (Exception e) {
			System.out.println("Error in Error Case 1: " + e.getMessage());
		}

		// Error Case 2: Modulus with null values
		Integer nullInt = null;
		try {
			int nullMod = nullInt % num2; // Expected: NullPointerException
			System.out.println("Error Case 2 - Modulus with Null Values Result: " + nullMod);
		} catch (NullPointerException e) {
			System.out.println("Error in Error Case 2: NullPointerException caught: " + e.getMessage());
		}

		// Error Case 3: Boolean Modulus (not allowed in Java)
		try {
			boolean boolVal = true;
			// int boolMod = boolVal % 2; // This would cause a compile-time error
			System.out.println("Error Case 3 - Compile-time error: Boolean cannot use modulus");
		} catch (Exception e) {
			System.out.println("Error in Error Case 3: " + e.getMessage());
		}
	}
}
