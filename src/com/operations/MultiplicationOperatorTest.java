package com.operations;

public class MultiplicationOperatorTest {
    public static void main(String[] args) {
        // Test 1: Basic Integer Multiplication
        int num1 = 5;
        int num2 = 7;
        int result = num1 * num2; // Expected: 35
        System.out.println("Test 1 - Integer Multiplication: " + result);

        // Test 2: Double Multiplication
        double double1 = 2.5;
        double double2 = 4.0;
        double doubleResult = double1 * double2; // Expected: 10.0
        System.out.println("Test 2 - Double Multiplication: " + doubleResult);

        // Test 3: Mixed Type Multiplication (int * double)
        int intVal = 10;
        double doubleVal = 3.5;
        double mixedResult = intVal * doubleVal; // Expected: 35.0
        System.out.println("Test 3 - Mixed Type Multiplication (int * double): " + mixedResult);

        // Test 4: Character Multiplication
        char char1 = 'A'; // ASCII value of 'A' is 65
        int charMult = char1 * 2; // Expected: 130 (65 * 2)
        System.out.println("Test 4 - Character Multiplication: " + charMult);

        // Test 5: Multiplication with Zero
        int zeroMult = num1 * 0; // Expected: 0
        System.out.println("Test 5 - Multiplication with Zero: " + zeroMult);

        // Test 6: Multiplication with Negative Numbers
        int negativeMult = num1 * -3; // Expected: -15
        System.out.println("Test 6 - Multiplication with Negative Numbers: " + negativeMult);

        // Test 7: Large Number Multiplication
        long large1 = 1_000_000_000L;
        long large2 = 2L;
        long largeResult = large1 * large2; // Expected: 2_000_000_000
        System.out.println("Test 7 - Large Number Multiplication: " + largeResult);

        // Test 8: Floating-point Precision Multiplication
        double precision1 = 0.1;
        double precision2 = 0.2;
        double precisionResult = precision1 * precision2; // Expected: 0.02 (but may have precision issues)
        System.out.println("Test 8 - Floating Point Precision Multiplication: " + precisionResult);

        // Error Case 1: Trying to multiply incompatible types (int * String)
        try {
             int invalidMult = num1 * "Hello"; // This would cause a compile-time error
            System.out.println("Error Case 1 - Compile-time error: Incompatible types (int * String)");
        } catch (Exception e) {
            System.out.println("Error in Error Case 1: " + e.getMessage());
        }

        // Error Case 2: Trying to multiply an Object and int
        Object obj = new Object();
        try {
            int objMult = obj * num1; // This would cause a compile-time error
            System.out.println("Error Case 2 - Compile-time error: Incompatible types (Object * int)");
        } catch (Exception e) {
            System.out.println("Error in Error Case 2: " + e.getMessage());
        }

        // Error Case 3: Multiplying null values
        Integer nullInt = null;
        try {
            int nullMult = nullInt * num2; // This will throw a NullPointerException
            System.out.println("Error Case 3 - Null Multiplication Result: " + nullMult);
        } catch (NullPointerException e) {
            System.out.println("Error in Error Case 3: NullPointerException caught: " + e.getMessage());
        }

        // Test 9: Boolean Multiplication (not allowed in Java)
        try {
            boolean boolVal = true;
             int boolMult = boolVal * 2; // This would cause a compile-time error
            System.out.println("Error Case 4 - Compile-time error: Boolean cannot be multiplied");
        } catch (Exception e) {
            System.out.println("Error in Error Case 4: " + e.getMessage());
        }
    }
}

