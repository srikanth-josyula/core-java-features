package com.classes.concrete;

public class CustomIntegerWrapper {
    private int value;

    // Constructor to initialize the wrapper with an integer value
    public CustomIntegerWrapper(int value) {
        this.value = value;
    }

    // Getter for the value
    public int getValue() {
        return value;
    }

    // Setter for the value with validation
    public void setValue(int value) {
        if (value >= 0) { // Example validation: only non-negative integers are allowed
            this.value = value;
        } else {
            throw new IllegalArgumentException("Value must be non-negative.");
        }
    }

    // Method to add another CustomIntegerWrapper to this instance
    public CustomIntegerWrapper add(CustomIntegerWrapper other) {
        return new CustomIntegerWrapper(this.value + other.value);
    }

    // Method to subtract another CustomIntegerWrapper from this instance
    public CustomIntegerWrapper subtract(CustomIntegerWrapper other) {
        return new CustomIntegerWrapper(this.value - other.value);
    }

    // Method to multiply by another CustomIntegerWrapper
    public CustomIntegerWrapper multiply(CustomIntegerWrapper other) {
        return new CustomIntegerWrapper(this.value * other.value);
    }

    // Method to divide by another CustomIntegerWrapper
    public CustomIntegerWrapper divide(CustomIntegerWrapper other) {
        if (other.value == 0) {
            throw new ArithmeticException("Cannot divide by zero.");
        }
        return new CustomIntegerWrapper(this.value / other.value);
    }

    // Overriding toString() for a meaningful representation
    @Override
    public String toString() {
        return "CustomIntegerWrapper{value=" + value + "}";
    }

    // Overriding equals() to compare CustomIntegerWrapper instances
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        CustomIntegerWrapper that = (CustomIntegerWrapper) obj;
        return value == that.value;
    }

    // Overriding hashCode() for correct hash-based collections behavior
    @Override
    public int hashCode() {
        return Integer.hashCode(value);
    }

    public static void main(String[] args) {
        CustomIntegerWrapper num1 = new CustomIntegerWrapper(10);
        CustomIntegerWrapper num2 = new CustomIntegerWrapper(5);

        // Performing operations
        CustomIntegerWrapper sum = num1.add(num2);
        CustomIntegerWrapper difference = num1.subtract(num2);
        CustomIntegerWrapper product = num1.multiply(num2);
        CustomIntegerWrapper quotient = num1.divide(num2);

        // Display results
        System.out.println("Number 1: " + num1);
        System.out.println("Number 2: " + num2);
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);

        // Testing validation and exception handling
        try {
            CustomIntegerWrapper invalid = new CustomIntegerWrapper(-1);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }

        // Testing equals() and hashCode()
        CustomIntegerWrapper num3 = new CustomIntegerWrapper(10);
        System.out.println("num1 equals num3: " + num1.equals(num3));
        System.out.println("num1 hashCode: " + num1.hashCode());
        System.out.println("num3 hashCode: " + num3.hashCode());
    }
}

