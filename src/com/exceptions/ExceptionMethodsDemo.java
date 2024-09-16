package com.exceptions;

class CustomeExceptionMethodsClass extends Exception {

	private static final long serialVersionUID = 1L;

	private String customMessage;
	private Throwable cause;

	// Constructor to initialize the detail message
	public CustomeExceptionMethodsClass(String message) {
		super(message);
		this.customMessage = message;
	}

	// Constructor to initialize the detail message and cause
	public CustomeExceptionMethodsClass(String message, Throwable cause) {
		super(message, cause);
		this.customMessage = message;
		this.cause = cause;
	}

	// Override getMessage() to return the detail message
	@Override
	public String getMessage() {
		return "Custom message: " + customMessage;
	}

	// Override toString() to provide a custom description
	@Override
	public String toString() {
		return "CustomException: " + customMessage + " (Cause: " + (cause != null ? cause.toString() : "None") + ")";
	}

	// Override getCause() to return the cause of this throwable
	@Override
	public Throwable getCause() {
		return cause;
	}

	// Override initCause() to initialize the cause of this throwable
	@Override
	public Throwable initCause(Throwable cause) {
		if (this.cause != null) {
			throw new IllegalStateException("Cause already initialized");
		}
		this.cause = cause;
		return this;
	}

	// Override getStackTrace() to return stack trace elements
	@Override
	public StackTraceElement[] getStackTrace() {
		return super.getStackTrace();
	}

	// Override printStackTrace() to print custom message along with the stack trace
	@Override
	public void printStackTrace() {
		System.err.println("Custom exception occurred: " + getMessage());
		super.printStackTrace();
	}

	// Override setStackTrace() to set stack trace elements
	@Override
	public void setStackTrace(StackTraceElement[] stackTrace) {
		super.setStackTrace(stackTrace);
	}
}

public class ExceptionMethodsDemo {

	public static void main(String[] args) {
		// Create an instance of ExceptionMethods with a custom message and cause
		CustomeExceptionMethodsClass exception = new CustomeExceptionMethodsClass("Custom error occurred",
				new IllegalArgumentException("Invalid argument"));

		// Call methods and display their output
		System.out.println("getMessage(): " + exception.getMessage());
		System.out.println("toString(): " + exception.toString());
		System.out.println("getCause(): " + exception.getCause());

		// Print stack trace to standard error
		System.out.println("\nprintStackTrace():");
		exception.printStackTrace();

		// Display stack trace elements
		System.out.println("\ngetStackTrace():");
		StackTraceElement[] stackTrace = exception.getStackTrace();
		for (StackTraceElement element : stackTrace) {
			System.out.println(element);
		}

		// Change stack trace (for demonstration purposes)
		StackTraceElement[] newStackTrace = new StackTraceElement[] {
				new StackTraceElement("com.exceptions.ExceptionDemo", "main", "ExceptionDemo.java", 20) };
		exception.setStackTrace(newStackTrace);

		System.out.println("\nUpdated stack trace:");
		exception.printStackTrace();

		// Reinitialize cause (if not already set)
		CustomeExceptionMethodsClass newException = new CustomeExceptionMethodsClass("Another error");
		newException.initCause(new RuntimeException("Reinitialized cause"));
		System.out.println("\nReinitialized cause: " + newException.getCause());

	}
}
