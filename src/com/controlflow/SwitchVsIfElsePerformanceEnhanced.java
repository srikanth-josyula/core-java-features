package com.controlflow;

public class SwitchVsIfElsePerformanceEnhanced {

    public static void main(String[] args) {
        int testValue = 1000000; // Number of iterations for the performance test

        // Measure time for switch statement
        long startTimeSwitch = System.nanoTime();
        for (int i = 0; i < testValue; i++) {
            performSwitch(i % 10); // Test with a range of values
        }
        long endTimeSwitch = System.nanoTime();
        long durationSwitch = endTimeSwitch - startTimeSwitch;
        System.out.println("Switch statement duration: " + durationSwitch + " nanoseconds");

        // Measure time for if-else statements
        long startTimeIfElse = System.nanoTime();
        for (int i = 0; i < testValue; i++) {
            performIfElse(i % 10); // Test with a range of values
        }
        long endTimeIfElse = System.nanoTime();
        long durationIfElse = endTimeIfElse - startTimeIfElse;
        System.out.println("If-else statements duration: " + durationIfElse + " nanoseconds");
    }

    // Method using switch statement with more cases
    public static void performSwitch(int value) {
        switch (value) {
            case 0:
                // Complex logic could be here
                break;
            case 1:
                // Complex logic could be here
                break;
            case 2:
                // Complex logic could be here
                break;
            case 3:
                // Complex logic could be here
                break;
            case 4:
                // Complex logic could be here
                break;
            case 5:
                // Complex logic could be here
                break;
            case 6:
                // Complex logic could be here
                break;
            case 7:
                // Complex logic could be here
                break;
            case 8:
                // Complex logic could be here
                break;
            case 9:
                // Complex logic could be here
                break;
            default:
                // Handle unexpected values
                break;
        }
    }

    // Method using if-else statements with more cases
    public static void performIfElse(int value) {
        if (value == 0) {
            // Complex logic could be here
        } else if (value == 1) {
            // Complex logic could be here
        } else if (value == 2) {
            // Complex logic could be here
        } else if (value == 3) {
            // Complex logic could be here
        } else if (value == 4) {
            // Complex logic could be here
        } else if (value == 5) {
            // Complex logic could be here
        } else if (value == 6) {
            // Complex logic could be here
        } else if (value == 7) {
            // Complex logic could be here
        } else if (value == 8) {
            // Complex logic could be here
        } else if (value == 9) {
            // Complex logic could be here
        } else {
            // Handle unexpected values
        }
    }
}
