package com.exceptions;

import java.io.IOException; // Import necessary for checked exceptions

//Custom checked exception class (extends Exception)
class CustomCheckedException extends Exception {
	public CustomCheckedException(String message) {
		super(message);
	}
}

//Custom unchecked exception class (extends RuntimeException)
class CustomUncheckedException extends RuntimeException {
	public CustomUncheckedException(String message) {
		super(message);
	}
}

public class ThrowsDemo {

	// Method that declares a checked exception using the 'throws' keyword
	public void methodThatThrowsChecked() throws IOException {
		// Simulate some code that throws an IOException (a checked exception)
		throw new IOException("Checked Exception: IO error occurred.");
	}

	// Method that declares multiple exceptions using 'throws'
	public void methodThatThrowsMultiple() throws IOException, CustomCheckedException {
		// Simulate code that throws a CustomCheckedException
		throw new CustomCheckedException("Checked Exception: Custom error occurred.");
	}

	// Method that does not declare an exception but calls methods that throw
	// exceptions
	public void handleExceptions() {
		try {
			methodThatThrowsChecked(); // Must handle IOException
		} catch (IOException e) {
			System.out.println("Caught IOException: " + e.getMessage());
		}

		try {
			methodThatThrowsMultiple(); // Must handle multiple exceptions
		} catch (IOException | CustomCheckedException e) {
			System.out.println("Caught exception: " + e.getMessage());
		}
	}

	// Method that throws an unchecked exception (no 'throws' declaration required)
	public void methodThatThrowsUnchecked() {
		throw new CustomUncheckedException("Unchecked Exception: Runtime error occurred.");
	}

	public static void main(String[] args) {
		ThrowsDemo demo = new ThrowsDemo();

		// Handling checked exceptions
		demo.handleExceptions();

		// No need to declare 'throws' for unchecked exceptions
		try {
			demo.methodThatThrowsUnchecked(); // This throws an unchecked exception
		} catch (CustomUncheckedException e) {
			System.out.println("Caught unchecked exception: " + e.getMessage());
		}
	}
}
