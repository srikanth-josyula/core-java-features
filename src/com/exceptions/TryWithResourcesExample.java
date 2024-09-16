package com.exceptions;

import java.io.*;
import java.util.concurrent.*;

public class TryWithResourcesExample {

	public static void main(String[] args) {
		System.out.println("Running example with try-with-resources...");
		tryWithResourcesExample();

		System.out.println("\nRunning example with multiple resources...");
		multipleResourcesExample();

		System.out.println("\nRunning example with custom resource...");
		customResourceExample();

		System.out.println("\nRunning example with exception suppression...");
		exceptionSuppressionExample();

		System.out.println("\nRunning example with System.exit()...");
		systemExitExample();

		System.out.println("\nRunning example with infinite loop...");
		infiniteLoopExample();
	}

	// Example of basic try-with-resources usage
	private static void tryWithResourcesExample() {
		try (BufferedReader br = new BufferedReader(new FileReader("file.txt"))) {
			// Use the BufferedReader
			System.out.println("File content: " + br.readLine());
		} catch (IOException e) {
			System.err.println("IOException caught: " + e.getMessage());
		}
		// No explicit finally block needed for closing BufferedReader
	}

	// Example of try-with-resources with multiple resources
	private static void multipleResourcesExample() {
		try (FileInputStream fis = new FileInputStream("file1.txt");
				FileOutputStream fos = new FileOutputStream("file2.txt")) {
			// Use FileInputStream and FileOutputStream
			int byteRead;
			while ((byteRead = fis.read()) != -1) {
				fos.write(byteRead);
			}
		} catch (IOException e) {
			System.err.println("IOException caught: " + e.getMessage());
		}
		// Both FileInputStream and FileOutputStream are closed automatically
	}

	// Example of custom resource implementing AutoCloseable
	// Custom resource class implementing AutoCloseable
	static class MyResource implements AutoCloseable {
		@Override
		public void close() {
			// Custom cleanup code
			System.out.println("Custom resource closed.");
		}
	}

	private static void customResourceExample() {
		try (MyResource resource = new MyResource()) {
			// Use custom resource
			System.out.println("Using custom resource.");
		} catch (Exception e) {
			System.err.println("Exception caught: " + e.getMessage());
		}
		// MyResource's close method is automatically called
	}

	// Example showing exception suppression
	private static void exceptionSuppressionExample() {
		try (BufferedReader br = new BufferedReader(new FileReader("file.txt"))) {
			// Throw an IOException to test exception suppression
			throw new IOException("Simulated IOException");
		} catch (IOException e) {
			System.err.println("IOException caught: " + e.getMessage());
			for (Throwable suppressed : e.getSuppressed()) {
				System.err.println("Suppressed exception: " + suppressed.getMessage());
			}
		}
		// FileReader's close method is automatically called
	}

	// Example where try-with-resources block is bypassed due to System.exit()
	private static void systemExitExample() {
		try (BufferedReader br = new BufferedReader(new FileReader("file.txt"))) {
			System.out.println("Inside try block");
			System.exit(0); // JVM terminates, so finally block or resource closure does not execute
		} catch (IOException e) {
			System.err.println("IOException caught: " + e.getMessage());
		}
		// This will not execute due to System.exit()
	}

	// Example with infinite loop that prevents resource closure
	private static void infiniteLoopExample() {
		try (BufferedReader br = new BufferedReader(new FileReader("file.txt"))) {
			while (true) {
				// Infinite loop
				// Resource closure will not occur
			}
		} catch (IOException e) {
			System.err.println("IOException caught: " + e.getMessage());
		}
		// The infinite loop prevents this from ever being reached
	}

}
