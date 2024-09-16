package com.exceptions;

class SampleUnCheckedException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public SampleUnCheckedException(String message) {
		super(message);
	}
}

public class SampleUnCheckedExceptionDemo {

	// This method throws an unchecked exception, no need to declare `throws`
	private void someMethod()  {
		throw new SampleUnCheckedException("Exception called..");
	}

	public static void main(String[] args) {

		SampleUnCheckedExceptionDemo cls = new SampleUnCheckedExceptionDemo();

		// NOTE: As this exception extends Runtime, I will not get errors asking to handle the exception
		cls.someMethod();

	}
}

//Output
/*
 * Exception in thread "main" com.exceptions.SampleUnCheckedException: Exception called..
 * at com.exceptions.SampleUnCheckedExceptionDemo.someMethod(SampleUnCheckedExceptionDemo.java:15)
 * at com.exceptions.SampleUnCheckedExceptionDemo.main(SampleUnCheckedExceptionDemo.java:24)
 */
