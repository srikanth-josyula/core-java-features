package com.controlflow;

public class RecursionFeatures {

    // Key Feature 1: Base case is essential in recursion
    // Example of calculating factorial using recursion
    public static int factorial(int n) {
        // Base case
        if (n == 0 || n == 1) {
            return 1;
        } else {
            // Recursive case: Progressing toward the base case
            return n * factorial(n - 1);
        }
    }

    // Key Feature 2: Tail recursion (optimized recursion where the recursive call is the last action)
    public static int factorialTail(int n, int accumulator) {
        if (n == 0 || n == 1) {
            return accumulator;
        } else {
            return factorialTail(n - 1, n * accumulator);  // Tail recursion
        }
    }

    // Key Feature 3: Recursion with multiple base cases
    // Example of Fibonacci sequence
    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;  // Base case 1
        } else if (n == 1) {
            return 1;  // Base case 2
        } else {
            // Recursive case
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    // Example of recursion with arrays - Summing elements of an array
    public static int sumArray(int[] arr, int n) {
        if (n <= 0) {  // Base case: Array size 0
            return 0;
        } else {
            return arr[n - 1] + sumArray(arr, n - 1);  // Recursive case
        }
    }

    // DO: Always provide a base case to prevent infinite recursion
    public static int infiniteRecursion(int n) {
        // BAD EXAMPLE: No base case, this will cause a StackOverflowError at runtime
        return n + infiniteRecursion(n - 1);  // Stack overflow due to no termination
    }

    // DON'T: Recursion that leads to a StackOverflowError if no base case is provided
    public static void recursionStackOverflowError(int n) {
        if (n < 0) { // Example base case (incorrect placement might lead to issues)
            return;
        }
        System.out.println(n);
        recursionStackOverflowError(n);  // Infinite recursion, causing StackOverflowError
    }

    // Compile-time error case: Missing return statement in recursive method
    // This would lead to a compile-time error because not all paths return a value
    public static int compileTimeErrorExample(int n) {
        if (n > 0) {
            return n * compileTimeErrorExample(n - 1);  // Recursive call
        }
        // Missing return here will cause a compile-time error
    }

    public static void main(String[] args) {
        // Best-case usage examples:
        System.out.println("Factorial of 5: " + factorial(5));  // Output: 120
        System.out.println("Factorial (Tail Recursion) of 5: " + factorialTail(5, 1));  // Output: 120
        System.out.println("Fibonacci of 5: " + fibonacci(5));  // Output: 5

        // Array Sum Example
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Sum of Array: " + sumArray(arr, arr.length));  // Output: 15

        // Uncomment to cause runtime errors
        // recursionStackOverflowError(5);  // Will cause StackOverflowError due to infinite recursion
        // System.out.println("Infinite recursion: " + infiniteRecursion(5));  // Will cause StackOverflowError

        // Uncomment to see compile-time error (uncommenting the following line will prevent compilation)
        // System.out.println("Compile Time Error Example: " + compileTimeErrorExample(5));
    }

  

}
