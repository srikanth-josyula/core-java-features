package com.strings;

import java.util.StringJoiner;

public class StringPerformanceAdvance {
    public static void main(String[] args) {
        int[] iterations = {100, 1000, 10000};
        String result;

        System.out.println("Immutable Methods (String literals, new String(), .concat(), String.format())");
        System.out.println("-----------------------------------------------------------------------------------------------------");
        System.out.printf("%-12s | %-20s | %-20s | %-20s | %-20s\n", "Iterations", "String literals", "new String()", ".concat()", "String.format()");
        System.out.println("-----------------------------------------------------------------------------------------------------");

        for (int it : iterations) {
            long startTime, endTime;

            // String literals
            startTime = System.nanoTime();
            for (int i = 0; i < it; i++) {
                String s1 = "Hello";
                String s2 = "World";
                result = s1 + s2;
            }
            endTime = System.nanoTime();
            double timeStringLiterals = (endTime - startTime) / 1e6; // Convert nanoseconds to milliseconds

            // new String()
            startTime = System.nanoTime();
            for (int i = 0; i < it; i++) {
                String s3 = new String("Hello");
                String s4 = new String("World");
                result = s3 + s4;
            }
            endTime = System.nanoTime();
            double timeNewString = (endTime - startTime) / 1e6; // Convert nanoseconds to milliseconds

            // .concat()
            startTime = System.nanoTime();
            for (int i = 0; i < it; i++) {
                String s5 = "Hello".concat("World");
            }
            endTime = System.nanoTime();
            double timeConcat = (endTime - startTime) / 1e6; // Convert nanoseconds to milliseconds

            // String.format()
            startTime = System.nanoTime();
            for (int i = 0; i < it; i++) {
                String s6 = String.format("%s%s", "Hello", "World");
            }
            endTime = System.nanoTime();
            double timeFormat = (endTime - startTime) / 1e6; // Convert nanoseconds to milliseconds

            // Display results for Immutable Methods
            System.out.printf("%-12d | %-20.3f | %-20.3f | %-20.3f | %-20.3f\n", it, timeStringLiterals, timeNewString, timeConcat, timeFormat);
        }

        System.out.println("\nMutable Methods (StringBuilder, StringBuffer, String.join(), StringJoiner)");
        System.out.println("-----------------------------------------------------------------------------------------------------");
        System.out.printf("%-12s | %-20s | %-20s | %-20s | %-20s\n", "Iterations", "StringBuilder", "StringBuffer", "String.join()", "StringJoiner");
        System.out.println("-----------------------------------------------------------------------------------------------------");

        for (int it : iterations) {
            long startTime, endTime;

            // StringBuilder
            startTime = System.nanoTime();
            for (int i = 0; i < it; i++) {
                StringBuilder sb = new StringBuilder();
                sb.append("Hello");
                sb.append("World");
                result = sb.toString();
            }
            endTime = System.nanoTime();
            double timeStringBuilder = (endTime - startTime) / 1e6; // Convert nanoseconds to milliseconds

            // StringBuffer
            startTime = System.nanoTime();
            for (int i = 0; i < it; i++) {
                StringBuffer buffer = new StringBuffer();
                buffer.append("Hello");
                buffer.append("World");
                result = buffer.toString();
            }
            endTime = System.nanoTime();
            double timeStringBuffer = (endTime - startTime) / 1e6; // Convert nanoseconds to milliseconds

            // String.join()
            startTime = System.nanoTime();
            for (int i = 0; i < it; i++) {
                String s6 = String.join("", "Hello", "World");
                result = s6;
            }
            endTime = System.nanoTime();
            double timeStringJoin = (endTime - startTime) / 1e6; // Convert nanoseconds to milliseconds

            // StringJoiner
            startTime = System.nanoTime();
            for (int i = 0; i < it; i++) {
                StringJoiner joiner = new StringJoiner("");
                joiner.add("Hello");
                joiner.add("World");
                result = joiner.toString();
            }
            endTime = System.nanoTime();
            double timeStringJoiner = (endTime - startTime) / 1e6; // Convert nanoseconds to milliseconds

            // Display results for Mutable Methods
            System.out.printf("%-12d | %-20.3f | %-20.3f | %-20.3f | %-20.3f\n", it, timeStringBuilder, timeStringBuffer, timeStringJoin, timeStringJoiner);
        }

        System.out.println("------------------------------------------------------------------------------------------------------");
    }
    
    /*
     * Immutable Methods (String literals, new String(), .concat(), String.format())
     * -----------------------------------------------------------------------------------------------------
     * Iterations   | String literals      | new String()         | .concat()            | String.format()     
     * -----------------------------------------------------------------------------------------------------
     * 100          | 0.258                | 0.236                | 0.159                | 0.667               
     * 1000         | 0.608                | 0.316                | 0.917                | 3.897               
     * 10000        | 1.977                | 2.249                | 1.170                | 6.860               
     * 
     * Mutable Methods (StringBuilder, StringBuffer, String.join(), StringJoiner)
     * -----------------------------------------------------------------------------------------------------
     * Iterations   | StringBuilder        | StringBuffer         | String.join()        | StringJoiner        
     * -----------------------------------------------------------------------------------------------------
     * 100          | 0.018                | 0.173                | 0.206                | 0.453               
     * 1000         | 0.212                | 0.821                | 1.761                | 2.136               
     * 10000        | 3.274                | 2.437                | 3.955                | 3.788               
     * ------------------------------------------------------------------------------------------------------
     */
}
