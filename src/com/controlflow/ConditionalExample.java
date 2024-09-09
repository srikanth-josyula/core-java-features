package com.controlflow;

public class ConditionalExample {

    public static void main(String[] args) {
        int number = 10;

        // Call different methods to demonstrate issues and best practices
        bestCaseExample(number);
        demonstrateMissingParentheses();
        demonstrateMissingBraces();
        demonstrateTypeMismatch();
        demonstrateUnnecessaryElse();
        demonstrateComplexConditions(6, 8, 15, 1, 20);
        demonstrateNestedConditionals(105);
        demonstrateReturnIssues(5);
    }

    // Best case usage of if, else if, and else
    public static void bestCaseExample(int number) {
        if (number > 0) {
            System.out.println("The number is positive.");
        } else if (number == 0) {
            System.out.println("The number is zero.");
        } else {
            System.out.println("The number is negative.");
        }
    }

    // Issue: Missing parentheses around the condition will cause a compile-time error
    public static void demonstrateMissingParentheses() {
        int number = 10;

        // This code will not compile because the condition is missing parentheses.
         if number > 0 { // Compile Error: Parentheses are required around the condition
             System.out.println("The number is positive.");
         }

        // Correct usage:
        if (number > 0) {
            System.out.println("The number is positive (corrected).");
        }
    }

    // Issue: Missing curly braces can lead to errors or unexpected behavior
    public static void demonstrateMissingBraces() {
        int number = -5;

        // This will cause an error because the 'else' lacks braces around the block of code.
         else
            System.out.println("This will cause an error");  // Error: Needs braces for clarity

        // Correct usage with braces:
        if (number > 0) {
            System.out.println("The number is positive.");
        } else {
            System.out.println("This will print correctly due to braces.");
        }
    }

    // Issue: Using incompatible types in the condition will cause a compile-time error
    public static void demonstrateTypeMismatch() {
        // This code will not compile because the condition must evaluate to a boolean expression.
         if ("text") { // Compile Error: The condition must be a boolean expression
             System.out.println("This will cause a compile error.");
         }

        // Correct usage:
        String text = "Hello";
        if (!text.isEmpty()) {
            System.out.println("The text is not empty.");
        }
    }

    // Issue: Unnecessary else after return
    public static void demonstrateUnnecessaryElse() {
        // This is an unnecessary use of 'else' since the if block already returns and exits.
        if (2 > 0) {
            System.out.println("Hello-2");
        } else {
            System.out.println("Bye-2"); // This else is redundant because the first block already completes the logic.
        }

        // Correct usage without unnecessary else:
        if (2 > 0) {
            System.out.println("Hello-2 (corrected).");
        }
        System.out.println("Bye-2 (corrected).");
    }

    // Issue: Avoid using overly complex logical conditions in a single if statement
    public static void demonstrateComplexConditions(int a, int b, int c, int d, int e) {
        // This is overly complex and difficult to read and maintain.
         if ((a > 5 && b < 10) || (c == 15 && d != 0) && e != 25) {
             // Complex condition
         }

        // Correct usage: Break it down into smaller, more manageable conditions.
        if (a > 5 && b < 10) {
            if (c == 15 && d != 0) {
                if (e != 25) {
                    System.out.println("Conditions are met (corrected).");
                }
            }
        }
    }

    // Issue: Nested and Unreadable Conditionals - Avoid deep nesting of conditions
    public static String demonstrateNestedConditionals(int number) {
        // Deep nesting makes the logic hard to follow.
        if (number > 0) {
            if (number < 100) {
                return "Positive and less than 100.";
            } else if (number == 100) {
                return "Positive and equals 100.";
            } else {
                return "Positive and greater than 100.";
            }
        } else {
            if (number == 0) {
                return "Zero.";
            } else {
                return "Negative.";
            }
        }

        // Correct usage: Flatten the logic if possible, or use early returns to reduce nesting.
    }

    // Issue: Missing return statements and unreachable code
    public static String demonstrateReturnIssues(int number) {
        // If no return is provided for every code path, the compiler will throw an error.
        if (number > 0) {
            return "Positive";
        } else if (number < 0) {
            return "Negative";
        }

        // This print statement is unreachable because return should be the final action.
        System.out.println("This code is unreachable");  // Will never be executed

        return "Zero"; // Correct return statement for unhandled cases.
    }
}
