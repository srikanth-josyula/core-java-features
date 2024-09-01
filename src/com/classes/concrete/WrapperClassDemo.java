package com.classes.concrete;

public class WrapperClassDemo {

	public static void main(String[] args) {
		// Boxing: Converting primitives to wrapper objects
		Integer intObj = Integer.valueOf(42); // Manual boxing
		Double doubleObj = Double.valueOf(3.14);
		Boolean boolObj = Boolean.valueOf(true);

		// Autoboxing: Automatic conversion of primitives to wrapper objects
		Integer autoBoxedInt = 100; // Autoboxing (int to Integer)
		Double autoBoxedDouble = 2.718; // Autoboxing (double to Double)

		// Unboxing: Extracting primitives from wrapper objects
		int intValue = intObj.intValue(); // Manual unboxing
		double doubleValue = doubleObj.doubleValue();
		boolean boolValue = boolObj.booleanValue();

		// Autounboxing: Automatic conversion of wrapper objects to primitives
		int autoUnboxedInt = autoBoxedInt; // Autounboxing (Integer to int)
		double autoUnboxedDouble = autoBoxedDouble; // Autounboxing (Double to double)

		// Wrapper class methods
		System.out.println("Integer methods:");
		System.out.println("MAX_VALUE: " + Integer.MAX_VALUE);
		System.out.println("MIN_VALUE: " + Integer.MIN_VALUE);
		System.out.println("toString: " + intObj.toString());
		System.out.println("equals: " + intObj.equals(42));
		System.out.println("compareTo: " + intObj.compareTo(50));

		System.out.println("\nDouble methods:");
		System.out.println("MAX_VALUE: " + Double.MAX_VALUE);
		System.out.println("MIN_VALUE: " + Double.MIN_VALUE);
		System.out.println("toString: " + doubleObj.toString());

		System.out.println("\nBoolean methods:");
		System.out.println("parseBoolean: " + Boolean.parseBoolean("true"));

		System.out.println("\nCharacter methods:");
		System.out.println("isDigit: " + Character.isDigit('5'));
		System.out.println("isLetter: " + Character.isLetter('A'));
		System.out.println("toUpperCase: " + Character.toUpperCase('b'));

		// Example of null value and handling
		Integer nullInt = null;
		try {
			System.out.println("\nNull Integer:");
			System.out.println("toString: " + nullInt.toString()); // This will throw a NullPointerException
		} catch (NullPointerException e) {
			System.out.println("Caught NullPointerException: " + e.getMessage());
		}

		// Working with Collections (e.g., ArrayList)
		java.util.ArrayList<Integer> intList = new java.util.ArrayList<>();
		intList.add(10); // Autoboxing occurs here
		intList.add(20);

		System.out.println("\nArrayList of Integers:");
		for (Integer num : intList) {
			System.out.println(num); // Auto-unboxing occurs here
		}
	}
}
