package com.exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AdvanceTryCatchDemo {

	private static final Logger logger = Logger.getLogger(AdvanceTryCatchDemo.class.getName());

	public static class CustomExceptionClass extends RuntimeException {

		// Throwable constructor with one params
		public CustomExceptionClass(String message) {
			super(message);
		}

		// Throwable constructor with String and throwable class
		public CustomExceptionClass(String message, Throwable cause) {
			super(message, cause);
			System.err.println("We are getting below error");
		}
	}

	public void demonstrateExceptionHandling() {

		/** Example of handling suppressed exceptions **/
		try (BufferedReader reader = new BufferedReader(new FileReader("file.txt"))) {
			// Code that might throw exceptions
		} catch (Exception e) {
			for (Throwable suppressed : e.getSuppressed()) {
				logger.log(Level.WARNING, "Suppressed exception", suppressed);
			}
		}

		/** Example of try-with-resources **/
		try (BufferedReader reader = new BufferedReader(new FileReader("file.txt"))) {
			// Do something
		} catch (IOException e) {
			logger.log(Level.SEVERE, "IOException occurred while reading file");
			// Re-throwing the exception to propagate it sometime, we need to do some ops
			// before and we may lose stacktrace so we re throw
			throw new CustomExceptionClass("File reading failed", e);
		}

		/** Example of multi-catch block **/
		try {
			BufferedReader reader = new BufferedReader(new FileReader("file.txt"));
			reader.close();
		} catch (IOException | CustomExceptionClass e) {
			logger.log(Level.SEVERE, "IOException or CustomExceptionClass", e);
		}

		/** Example of exception chaining **/
		try {
			throw new IOException("Original IO error");
		} catch (IOException e) {
			throw new CustomExceptionClass("Failed during file operation", e);
		}

	}

	public static void main(String[] args) {
		AdvanceTryCatchDemo demo = new AdvanceTryCatchDemo();
		demo.demonstrateExceptionHandling();
	}
}
