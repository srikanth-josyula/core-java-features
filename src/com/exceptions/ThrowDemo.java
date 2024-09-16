package com.exceptions;

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

public class ThrowDemo {

	// Method that throws a checked exception (requires throws declaration)
	public void checkValue(int value) throws CustomCheckedException {
		if (value < 0) {
			// Explicitly throw a custom checked exception
			throw new CustomCheckedException("Value must be non-negative (Checked Exception)");
		}

		System.out.println("Value is non-negative: " + value);
	}

	// Method that throws an unchecked exception (does not need throws declaration)
	public void performDivision(int numerator, int denominator) {
		if (denominator == 0) {
			// Explicitly throw a custom unchecked exception
			throw new CustomUncheckedException("Cannot divide by zero (Unchecked Exception)");
		}

		System.out.println("Result: " + numerator / denominator);
	}

	public static void main(String[] args) {
		ThrowDemo demo = new ThrowDemo();

		// Handling checked exception using try-catch block
		try {
			// This will throw CustomCheckedException
			demo.checkValue(-1);
		} catch (CustomCheckedException e) {
			// Catch and handle the exception
			System.out.println("Caught checked exception: " + e.getMessage());
		}

		// Handling unchecked exception using try-catch block
		try {
			// This will throw CustomUncheckedException
			demo.performDivision(10, 0);
		} catch (CustomUncheckedException e) {
			// Catch and handle the exception
			System.out.println("Caught unchecked exception: " + e.getMessage());
		}

		// Showing how exception halts the normal flow
		try {
			// This will execute normally
			demo.performDivision(10, 2);
			// This line will not execute if an exception occurs in performDivision()
			System.out.println("This line executes after a successful division.");
		} catch (CustomUncheckedException e) {
			// Handle any runtime exceptions
			System.out.println("Caught an error: " + e.getMessage());
		}

		// Propagation of exceptions (when not caught)
		try {
			// This exception will propagate up the stack
			demo.propagateException();
		} catch (CustomCheckedException e) {
			System.out.println("Exception propagated and caught: " + e.getMessage());
		}
	}

	// Method showing propagation (throws keyword for checked exception)
	public void propagateException() throws CustomCheckedException {
		// This method throws a checked exception, which will propagate
		throw new CustomCheckedException("Exception propagated up the stack");
	}
}
