package com.exceptions;

//System allows any class extending `Throwable` it is generally not recommended.

public class ThrowableConstructors extends Exception {

	private static final long serialVersionUID = 1L;

	// Constructor with no arguments
	public ThrowableConstructors() {
		super();
	}

	// Constructor with a detail message
	public ThrowableConstructors(String message) {
		super(message);
	}

	// Constructor with a detail message and a cause
	public ThrowableConstructors(String message, Throwable cause) {
		super(message, cause);
	}

	// Constructor with a cause
	public ThrowableConstructors(Throwable cause) {
		super(cause);
	}

	// Example usage of the CustomException class
	public static void main(String[] args) {
		try {
			// Throwing CustomException with no arguments
			throw new ThrowableConstructors();
		} catch (ThrowableConstructors e) {
			System.out.println("Caught CustomException with no arguments");
		}

		try {
			// Throwing CustomException with a detail message
			throw new ThrowableConstructors("This is a specific error message.");
		} catch (ThrowableConstructors e) {
			System.out.println("Caught CustomException with message: " + e.getMessage());
		}

		try {
			// Throwing CustomException with a detail message and a cause
			throw new ThrowableConstructors("This is a message with a cause",
					new IllegalArgumentException("Illegal argument"));
		} catch (ThrowableConstructors e) {
			System.out.println("Caught CustomException with message: " + e.getMessage());
			System.out.println("Caused by: " + e.getCause());
		}

		try {
			// Throwing CustomException with a cause only
			throw new ThrowableConstructors(new IllegalArgumentException("Illegal argument"));
		} catch (ThrowableConstructors e) {
			System.out.println("Caught CustomException caused by: " + e.getCause());
		}
	}
}
