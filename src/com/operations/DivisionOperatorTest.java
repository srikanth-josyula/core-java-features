package com.operations;

public class DivisionOperatorTest {
    public static void main(String[] args) {
        // Test 1: Basic Integer Division
        int num1 = 10;
        int num2 = 2;
        int intResult = num1 / num2; // Expected: 5
        System.out.println("Test 1 - Integer Division: " + intResult);

        // Test 2: Integer Division with Rounding (division truncates toward zero)
        int num3 = 7;
        int intRoundResult = num3 / num2; // Expected: 3 (7 / 2 truncates to 3, no rounding)
        System.out.println("Test 2 - Integer Division with Rounding: " + intRoundResult);

        // Test 3: Double Division
        double double1 = 7.0;
        double double2 = 2.0;
        double doubleResult = double1 / double2; // Expected: 3.5
        System.out.println("Test 3 - Double Division: " + doubleResult);

        // Test 4: Mixed Type Division (int / double)
        double mixedResult = num1 / double2; // Expected: 5.0 (int is promoted to double)
        System.out.println("Test 4 - Mixed Type Division (int / double): " + mixedResult);

        // Test 5: Division by Zero (Integer)
        try {
            int divisionByZero = num1 / 0; // Expected: ArithmeticException (division by zero)
            System.out.println("Test 5 - Division by Zero (Integer): " + divisionByZero);
        } catch (ArithmeticException e) {
            System.out.println("Error in Test 5 - Division by Zero (Integer): " + e.getMessage());
        }

        // Test 6: Division by Zero (Double)
        double doubleDivByZero = double1 / 0.0; // Expected: Infinity
        System.out.println("Test 6 - Division by Zero (Double): " + doubleDivByZero);

        // Test 7: Division of zero by a number
        int zeroDivision = 0 / num2; // Expected: 0
        System.out.println("Test 7 - Zero divided by a number: " + zeroDivision);

        // Test 8: Division with Negative Numbers
        int negativeDivision = num1 / -2; // Expected: -5
        System.out.println("Test 8 - Division with Negative Numbers: " + negativeDivision);

        // Test 9: Large Number Division
        long large1 = 1_000_000_000L;
        long large2 = 2L;
        long largeResult = large1 / large2; // Expected: 500_000_000
        System.out.println("Test 9 - Large Number Division: " + largeResult);

        // Test 10: Floating-point Precision Issues
        double precision1 = 1.0;
        double precision2 = 3.0;
        double precisionResult = precision1 / precision2; // Expected: 0.3333... (repeating decimal)
        System.out.println("Test 10 - Floating Point Precision Division: " + precisionResult);

        // Error Case 1: Trying to divide incompatible types (int / String)
        try {
            int invalidDivision = num1 / "Hello"; // This would cause a compile-time error
            System.out.println("Error Case 1 - Compile-time error: Incompatible types (int / String)");
        } catch (Exception e) {
            System.out.println("Error in Error Case 1: " + e.getMessage());
        }

        // Error Case 2: Division with null values
        Integer nullInt = null;
        try {
            int nullDiv = nullInt / num2; // Expected: NullPointerException
            System.out.println("Error Case 2 - Null Division Result: " + nullDiv);
        } catch (NullPointerException e) {
            System.out.println("Error in Error Case 2: NullPointerException caught: " + e.getMessage());
        }

        // Error Case 3: Boolean Division (not allowed in Java)
        try {
            boolean boolVal = true;
            int boolDiv = boolVal / 2; // This would cause a compile-time error
            System.out.println("Error Case 3 - Compile-time error: Boolean cannot be divided");
        } catch (Exception e) {
            System.out.println("Error in Error Case 3: " + e.getMessage());
        }
    }
}

