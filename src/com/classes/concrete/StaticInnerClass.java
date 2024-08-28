package com.classes.concrete;

public class StaticInnerClass {

	    // Static field in the outer class
	    private static String outerStaticField = "Outer static field";

	    // Non-static field in the outer class
	    private String outerNonStaticField = "Outer non-static field";

	    // Static method in the outer class
	    public static void outerStaticMethod() {
	        System.out.println("Outer static method");
	    }

	    // Non-static method in the outer class
	    public void outerNonStaticMethod() {
	        System.out.println("Outer non-static method");
	    }

	    // Static Nested Class
	    public static class StaticNestedClass {

	        // Static method in the static nested class
	        public static void staticNestedMethod() {
	            System.out.println("Static nested class static method");
	            System.out.println("Accessing outer class's static field: " + outerStaticField); // Access static field of outer class
	            outerStaticMethod(); // Call static method of outer class
	        }

	        // Non-static method in the static nested class
	        public void nonStaticNestedMethod() {
	            System.out.println("Static nested class non-static method");

	            // Can't access non-static members of the outer class directly
	            // System.out.println("Accessing outer class's non-static field: " + outerNonStaticField); // Error
	            // outerNonStaticMethod(); // Error

	            // To access non-static members of the outer class, we need an instance of the outer class
	            StaticInnerClass outer = new StaticInnerClass();
	            System.out.println("Accessing outer class's non-static field: " + outer.outerNonStaticField);
	            outer.outerNonStaticMethod();
	        }
	    }

	    // Main method to demonstrate the use of the static nested class
	    public static void main(String[] args) {
	        // Accessing static method of the static nested class directly using the class name
	        StaticNestedClass.staticNestedMethod();

	        // Creating an instance of the static nested class and calling its non-static method
	        StaticNestedClass nestedInstance = new StaticNestedClass();
	        nestedInstance.nonStaticNestedMethod();
	    }
	}
