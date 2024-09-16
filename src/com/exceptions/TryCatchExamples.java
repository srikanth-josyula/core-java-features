package com.exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLException;

public class TryCatchExamples {

    public static void main(String[] args) {

        // DO: Use try-with-resources to manage resources and avoid leaks
        try (BufferedReader reader = new BufferedReader(new FileReader("file.txt"))) {
        } catch (IOException e) {
            // DO: Handle specific exceptions
            System.err.println("IOException occurred: " + e.getMessage());
        } catch (Exception e) {
            // DO: Catch general exceptions after specific ones
            System.err.println("An unexpected exception occurred: " + e.getMessage());
        }

        // DO: Catch multiple exceptions if the handling logic is the same
        try (BufferedReader reader = new BufferedReader(new FileReader("file1.txt"))) {
            // Code that may throw IOException or FileNotFoundException
        } catch (IOException | SQLException e) {
            // Handle both IOException and SQLException
            System.err.println("IOException or SQLException occurred: " + e.getMessage());
        }

        // DON'T: Catch general exceptions before specific ones (will result in compile-time error)
        // This will cause a compile-time error because Exception is more general than IOException
        try (BufferedReader reader = new BufferedReader(new FileReader("file2.txt"))) {
            // Code that may throw IOException
        } catch (Exception e) {
            System.err.println("Exception occurred: " + e.getMessage());
        } catch (IOException e) {  // COMPILE-ERROR: Unreachable catch block for IOException
            System.err.println("IOException occurred: " + e.getMessage());
        }

        // DON'T: Use exceptions for control flow
        try {
            if (true) {
                throw new RuntimeException("Control flow exception");
            }
        } catch (RuntimeException e) {
            System.err.println("Handling control flow exception: " + e.getMessage());
        }

        // DO: Re-throw exceptions when necessary to allow higher-level handling
        try {
            processFile();
        } catch (IOException e) {
            // Log and re-throw to propagate the exception
            System.err.println("Re-throwing IOException: " + e.getMessage());
            throw e; // Re-throwing the exception
        }
    }

    // Example method that might throw an exception
    private static void processFile() throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader("file3.txt"))) {
            // Code that might throw IOException
        }
    }
}
