package com.operations;

public class LogicalOperatorsTest {
    public static void main(String[] args) {
        // Test 1: Logical AND (&&)
        boolean condition1 = true;
        boolean condition2 = false;
        boolean andResult = condition1 && condition2; // Expected: false
        System.out.println("Test 1 - Logical AND (true && false): " + andResult);

        // Test 2: Logical OR (||)
        boolean condition3 = true;
        boolean condition4 = false;
        boolean orResult = condition3 || condition4; // Expected: true
        System.out.println("Test 2 - Logical OR (true || false): " + orResult);

        // Test 3: Logical NOT (!)
        boolean condition5 = true;
        boolean notResult = !condition5; // Expected: false
        System.out.println("Test 3 - Logical NOT (!true): " + notResult);

        // Test 4: Short-circuit evaluation in Logical AND (&&)
        int x = 5;
        int y = 10;
        boolean shortCircuitAnd = (x > 0 && y / x > 1); // y / x is evaluated (Expected: true)
        System.out.println("Test 4 - Short-circuit AND (x > 0 && y / x > 1): " + shortCircuitAnd);

        // Test 5: Short-circuit evaluation with false left-hand operand
        boolean shortCircuitAndFalse = (x < 0 && y / x > 1); // y / x is NOT evaluated because x < 0 (Expected: false)
        System.out.println("Test 5 - Short-circuit AND with false left-hand (x < 0 && y / x > 1): " + shortCircuitAndFalse);

        // Test 6: Short-circuit evaluation in Logical OR (||)
        boolean shortCircuitOr = (x > 0 || y / x > 1); // y / x is NOT evaluated because x > 0 (Expected: true)
        System.out.println("Test 6 - Short-circuit OR (x > 0 || y / x > 1): " + shortCircuitOr);

        // Test 7: Logical combination with multiple conditions
        boolean combinedCondition = (x > 0 && y < 20 || y / x == 2); // Expected: true (y < 20 is true, so it passes before y / x)
        System.out.println("Test 7 - Combination of AND and OR: " + combinedCondition);

        // Test 8: Using NOT with complex condition
        boolean complexCondition = !(x > 0 && y < 20); // Expected: false (x > 0 && y < 20 is true, but ! negates it)
        System.out.println("Test 8 - NOT with complex condition: " + complexCondition);

        // Test 9: Using AND with side effects (risky)
        int z = 0;
        boolean riskyAnd = (x > 0 && ++z > 0); // Expected: false, z will be incremented even if the result is false
        System.out.println("Test 9 - Logical AND with side effect (++z): " + riskyAnd + ", z after evaluation: " + z);

        // Test 10: Incorrect logical use (logical operators should only be used with booleans)
        // Uncommenting the following code will cause a compilation error.
        // int a = 5;
        // int b = 10;
        // boolean invalid = (a && b); // Compilation Error! AND operator cannot be applied to int

        // Test 11: Short-circuit with division by zero error prevention
        int num = 0;
        boolean preventDivByZero = (num != 0 && (10 / num) > 1); // num != 0 prevents division by zero (Expected: false, but safe)
        System.out.println("Test 11 - Prevent division by zero with short-circuit AND: " + preventDivByZero);
    }
}
