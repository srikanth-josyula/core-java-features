package com.controlflow;

import java.util.Arrays;
import java.util.List;

public class EnhancedForLoopExample {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        List<String> stringList = Arrays.asList("apple", "banana", "cherry");


        // Best case usage of enhanced for loop
        bestCaseExample(numbers);

        // Issue: Modifying collection while iterating
        demonstrateModificationDuringIteration(numbers);

        // Issue: Incompatible types in enhanced for loop
        demonstrateTypeMismatch();

        // Issue: Enhanced for loop with non-iterable types
        demonstrateNonIterableTypes();

        // Issue: Handling empty arrays
        demonstrateEmptyArray(new int[]{});

        // Issue: Using enhanced for loop with incorrect data types
        demonstrateIncorrectDataTypes();
        
        // Additional examples of immutable iteration
        demonstrateImmutableIteration(stringList);
    }

    // Best case usage of enhanced for loop
    public static void bestCaseExample(int[] numbers) {
        // Proper use of enhanced for loop to iterate over an array
        System.out.println("Best case usage:");
        for (int number : numbers) {
            System.out.println(number);
        }
    }

    // Issue: Modifying the collection while iterating
    public static void demonstrateModificationDuringIteration(int[] numbers) {
        // This example demonstrates an incorrect approach as we shouldn't modify the array while iterating over it.
        System.out.println("\nModifying collection during iteration:");
        for (int number : numbers) {
            // Direct modification like this is incorrect as it changes the original collection.
             numbers[0] = 100; // This should not be done within the loop.
            System.out.println(number);
        }
    }

    // Issue: Incompatible types in enhanced for loop
    public static void demonstrateTypeMismatch() {
        // This example will not compile due to type mismatch in the enhanced for loop.
        // The enhanced for loop expects the array elements to be of the same type as the loop variable.
        System.out.println("\nType mismatch in enhanced for loop:");
        // String[] strings = {"one", "two", "three"};
         for (int s : strings) { // Compile Error: Incompatible types: String cannot be converted to int
             System.out.println(s);
         }

        // Correct usage:
        String[] strings = {"one", "two", "three"};
        for (String s : strings) {
            System.out.println(s);
        }
    }

    // Issue: Enhanced for loop with non-iterable types
    public static void demonstrateNonIterableTypes() {
        // Enhanced for loop cannot be used with non-iterable types.
        System.out.println("\nUsing enhanced for loop with non-iterable types:");

        // int number = 10;
         for (int n : number) { // Compile Error: int cannot be converted to Iterable
             System.out.println(n);
         }

        // Correct usage with an array
        int[] numbers = {1, 2, 3};
        for (int n : numbers) {
            System.out.println(n);
        }
    }

    // Issue: Handling empty arrays
    public static void demonstrateEmptyArray(int[] numbers) {
        // Enhanced for loop works correctly even with an empty array
        System.out.println("\nHandling empty arrays:");
        for (int number : numbers) {
            System.out.println(number); // Nothing will print as the array is empty
        }
    }

    // Issue: Using enhanced for loop with incorrect data types
    public static void demonstrateIncorrectDataTypes() {
        // This example demonstrates the incorrect use of enhanced for loop with incompatible types.
        System.out.println("\nUsing enhanced for loop with incorrect data types:");
        
        // For example, if you try to use an enhanced for loop with a mix of different types, it will fail.
         Object[] mixedArray = {1, "string", 3.14};
         for (int item : mixedArray) { // Compile Error: Incompatible types
             System.out.println(item);
         }

        // Correct usage:
        Object[] mixedArray = {1, "string", 3.14};
        for (Object item : mixedArray) {
            System.out.println(item);
        }
    }
    
 // Additional examples: Immutable iteration with collections
    public static void demonstrateImmutableIteration(List<String> stringList) {
        System.out.println("\nImmutable iteration with collections:");
        // The enhanced for loop works with any collection that implements Iterable.
        // It is read-only for the collection being iterated.
        for (String fruit : stringList) {
            System.out.println(fruit);
        }

        // Uncommenting the following lines would cause a ConcurrentModificationException if you tried to modify the list during iteration.
        // for (String fruit : stringList) {
        //     stringList.add("orange"); // This will cause a ConcurrentModificationException.
        // }
    }
}
