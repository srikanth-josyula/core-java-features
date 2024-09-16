package com.exceptions;

class SampleThrowableException extends Throwable {
    private static final long serialVersionUID = 1L;

    public SampleThrowableException(String message) {
        super(message);
    }
}

public class ExtendingThrowableException {

    private void someMethod() {
        // Throw the custom exception
        throw new SampleThrowableException("Custom Throwable Exception treated as unchecked.");
    }

    public static void main(String[] args) {
        ExtendingThrowableException obj = new ExtendingThrowableException();
        
        // No try-catch required in this case
        obj.someMethod();
        
        // If you want to handle it, you can add try-catch
        try {
            obj.someMethod();
        } catch (SampleThrowableException e) {
            System.out.println(e.getMessage());
        }
    }
}
