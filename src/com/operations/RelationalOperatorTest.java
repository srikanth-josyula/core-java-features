package com.operations;

public class RelationalOperatorTest {
    public static void main(String[] args) {
        // Test 1: Greater than (>) with int
        int a = 7;
        int b = 5;
        boolean greaterThan = (a > b); // Expected: true
        System.out.println("Test 1 - Greater than (a > b): " + greaterThan);

        // Test 2: Less than (<) with int
        int x = 3;
        int y = 6;
        boolean lessThan = (x < y); // Expected: true
        System.out.println("Test 2 - Less than (x < y): " + lessThan);

        // Test 3: Greater than or equal to (>=) with double
        double p = 4.5;
        double q = 4.5;
        boolean greaterThanOrEqual = (p >= q); // Expected: true
        System.out.println("Test 3 - Greater than or equal to (p >= q): " + greaterThanOrEqual);

        // Test 4: Less than or equal to (<=) with int
        int m = 10;
        int n = 15;
        boolean lessThanOrEqual = (m <= n); // Expected: true
        System.out.println("Test 4 - Less than or equal to (m <= n): " + lessThanOrEqual);

        // Test 5: Edge case with zero
        int zero = 0;
        boolean zeroComparison = (zero >= 0); // Expected: true
        System.out.println("Test 5 - Edge case with zero (zero >= 0): " + zeroComparison);

        // Test 6: Comparing different types (int and double)
        int intVar = 10;
        double doubleVar = 10.0;
        boolean mixedTypeComparison = (intVar <= doubleVar); // Expected: true
        System.out.println("Test 6 - Comparing int and double (intVar <= doubleVar): " + mixedTypeComparison);

        // Test 7: Comparison with negative numbers
        int neg1 = -5;
        int pos1 = 5;
        boolean negativeComparison = (neg1 < pos1); // Expected: true
        System.out.println("Test 7 - Negative comparison (neg1 < pos1): " + negativeComparison);

        // Test 8: Logical error case (not directly possible but showcasing incorrect logic)
        // Using `>` or `<` on non-numeric types (e.g., String or Object) will cause compilation error
        // Uncommenting the line below will cause a compilation error.
        // String str1 = "apple";
        // String str2 = "banana";
        // boolean errorCase = (str1 > str2); // Compilation Error! Cannot compare non-numeric types

        // Test 9: Comparison with null (illegal comparison)
        // Uncommenting the lines below will cause a NullPointerException.
        // Integer nullVar = null;
        // boolean nullComparison = (nullVar > 5); // Runtime Error! NullPointerException

        // Test 10: Using relational operators with characters
        char char1 = 'A';
        char char2 = 'B';
        boolean charComparison = (char1 < char2); // Expected: true ('A' has a lower ASCII value than 'B')
        System.out.println("Test 10 - Character comparison (char1 < char2): " + charComparison);

        // Test 11: Floating-point precision issue
        double float1 = 0.1 + 0.2; // Due to floating-point precision, this won't be exactly 0.3
        boolean precisionIssue = (float1 == 0.3); // Expected: false
        System.out.println("Test 11 - Floating-point precision issue: " + precisionIssue);
    }
}

