package com.exceptions;

public class FinallyExample {

    public static void main(String[] args) {
        System.out.println("Running example with normal execution...");
        normalExecution();

        System.out.println("\nRunning example with System.exit()...");
        systemExitExample();

        System.out.println("\nRunning example with infinite loop...");
        infiniteLoopExample();

        System.out.println("\nRunning example with thread interruption...");
        threadInterruptionExample();
    }

    // Example of normal execution where finally block always executes
    private static void normalExecution() {
        try {
            System.out.println("Inside try block");
            // Normal processing
        } catch (Exception e) {
            System.err.println("Exception caught: " + e.getMessage());
        } finally {
            System.out.println("Inside finally block"); // This will always execute
        }
    }

    // Example where finally block does not execute due to System.exit()
    private static void systemExitExample() {
        try {
            System.out.println("Inside try block");
            System.exit(0); // Terminates JVM
        } finally {
            System.out.println("Inside finally block"); // This will not execute
        }
    }

    // Example where finally block does not execute due to infinite loop
    private static void infiniteLoopExample() {
        try {
            System.out.println("Inside try block");
            while (true) {
                // Infinite loop
            }
        } finally {
            System.out.println("Inside finally block"); // This will not execute
        }
    }

    // Example where finally block may not execute due to thread interruption
    private static void threadInterruptionExample() {
        Thread thread = new Thread(() -> {
            try {
                System.out.println("Inside try block");
                Thread.currentThread().stop(); // Deprecated and unsafe
            } finally {
                System.out.println("Inside finally block"); // This may not execute
            }
        });

        thread.start();
        try {
            thread.join(); // Wait for thread to complete
        } catch (InterruptedException e) {
            System.err.println("Main thread interrupted: " + e.getMessage());
        }
    }
}
