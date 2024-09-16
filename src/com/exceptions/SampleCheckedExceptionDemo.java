package com.exceptions;

class SampleCheckedException extends Exception {

	private static final long serialVersionUID = 1L;

	public SampleCheckedException(String message) {
		super(message);
	}
}

public class SampleCheckedExceptionDemo {

	private void someMethod() throws SampleCheckedException {
		throw new SampleCheckedException("Checked Custom Exception called..");
	}

	public static void main(String[] args) {

		SampleCheckedExceptionDemo cls = new SampleCheckedExceptionDemo();

		//NOTE: If i remove try-catch, I will see error `Unhandled exception type SampleCheckedException`
		try {
			cls.someMethod();
		} catch (SampleCheckedException e) {
			System.out.println(e.getMessage());
		}

	}
}

//Output
/*
 * Checked Custom Exception called..
 */