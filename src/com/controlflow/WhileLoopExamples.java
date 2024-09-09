package com.controlflow;

import java.util.Scanner;

public class WhileLoopExamples {

    public static void main(String[] args) {
        whileLoopExample();
        whileLoopBreakContinueExample();
        doWhileInputValidationExample();
        doWhileMenuExample();
    }

    // 1. Basic while loop with correct loop control variable initialization and update
    public static void whileLoopExample() {
        System.out.println("=== While Loop Example ===");
        int count = 0;
        
        // Preventing infinite loop by correctly updating the control variable 'count'
        while (count < 5) {
            System.out.println("Count: " + count);
            count++;  // Ensure the loop control variable is updated to avoid an infinite loop
        }
        System.out.println();
    }

    // 2. While loop with break and continue statements
    public static void whileLoopBreakContinueExample() {
        System.out.println("=== While Loop with Break and Continue ===");
        int count = 0;
        
        while (count < 10) {
            if (count == 5) {
                break;  // Exit the loop when count is 5
            }
            if (count % 2 == 0) {
                count++;
                continue;  // Skip even numbers
            }
            System.out.println("Odd Count: " + count);
            count++;
        }
        System.out.println();
    }

    // 3. Do-while loop for input validation - Ensures the loop executes at least once
    public static void doWhileInputValidationExample() {
        System.out.println("=== Do-While Loop for Input Validation ===");
        Scanner scanner = new Scanner(System.in);
        int number;
        
        // Ensures the code block is executed at least once regardless of the initial condition
        do {
            System.out.print("Enter a number greater than 0: ");
            number = scanner.nextInt();
        } while (number <= 0);  // Check the condition after the loop body has executed
        
        System.out.println("Valid number entered: " + number);
        System.out.println();
    }

    // 4. Do-while loop for a menu-driven program
    public static void doWhileMenuExample() {
        System.out.println("=== Do-While Loop for Menu Example ===");
        Scanner scanner = new Scanner(System.in);
        int choice;
        
        // Menu-driven program - Ensures that the menu is shown at least once
        do {
            System.out.println("1. Option 1");
            System.out.println("2. Option 2");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            
            // Using switch inside the loop to handle menu options
            switch (choice) {
                case 1:
                    System.out.println("Option 1 selected.");
                    break;
                case 2:
                    System.out.println("Option 2 selected.");
                    break;
                case 3:
                    System.out.println("Exiting program.");
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        } while (choice != 3);  // Continue the loop until the user chooses to exit
        
        System.out.println("Program exited.");
    }
}
