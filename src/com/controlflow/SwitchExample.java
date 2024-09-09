package com.controlflow;

public class SwitchExample {

	public static void main(String[] args) {
		int number = 2;
		String day = "Monday";

		// Best case usage of switch
		bestCaseExample(number);

		// Compile-time errors in switch
		demonstrateCompileTimeErrors();

		// Runtime errors and issues with switch
		demonstrateRuntimeErrors(day);

		// Don'ts and common pitfalls with switch
		demonstrateDonts();

		printDayName(number);
	}

	// Best case usage of switch
	public static void bestCaseExample(int number) {
		System.out.println("Best case usage of switch:");
		switch (number) {
		case 1:
			System.out.println("Number is one.");
			break;
		case 2:
			System.out.println("Number is two.");
			break;
		case 3:
			System.out.println("Number is three.");
			break;
		default:
			System.out.println("Number is not one, two, or three.");
			break;
		}
	}

	// Compile-time errors in switch
	public static void demonstrateCompileTimeErrors() {
		System.out.println("\nCompile-time errors in switch:");

		// Uncommenting the following lines will cause compile-time errors
		// char letter = 'A';
		// switch (letter) {
		// case "A": // Compile Error: Incompatible type: String cannot be converted to
		// char
		// System.out.println("Letter is A");
		// break;
		// }

		// Correct usage with char
		char letter = 'A';
		switch (letter) {
		case 'A':
			System.out.println("Letter is A");
			break;
		case 'B':
			System.out.println("Letter is B");
			break;
		default:
			System.out.println("Letter is not A or B");
			break;
		}
	}

	// Runtime errors and issues with switch
	public static void demonstrateRuntimeErrors(String day) {
		System.out.println("\nRuntime errors and issues with switch:");

		// Uncommenting the following code will not cause a runtime exception but
		// demonstrates an issue
		// that could lead to unexpected behavior if not handled correctly. because dont
		// have sunday error will come

		switch (day) {
		case "Monday":
			System.out.println("Start of the work week.");
			break;
		case "Friday":
			System.out.println("End of the work week.");
			break;
		default:
			System.out.println("Mid-week days.");
			break;
		}
	}

	// Don'ts and common pitfalls with switch
	public static void demonstrateDonts() {
		System.out.println("\nDon'ts and common pitfalls with switch:");

		// Fall-through without break
		int number = 2;
		switch (number) {
		case 1:
			System.out.println("Number is one.");
			// Intentional fall-through
		case 2:
			System.out.println("Number is two.");
			// No break here, so it falls through to the next case
			// If fall-through is intentional, it's okay; otherwise, it may lead to bugs.
			// break;
		case 3:
			System.out.println("Number is three.");
			break;
		default:
			System.out.println("Number is not one, two, or three.");
			break;

		// OUTPUT
		// Don'ts and common pitfalls with switch:
		// Number is two.
		// Number is three.
		}

		// Duplicate case values
		// Uncommenting the following lines will cause compile-time error due to
		// duplicate case values.
		/*
		 * switch (number) { case 1: System.out.println("Number is one."); break; case
		 * 2: System.out.println("Number is two."); break; case 2: // Compile Error:
		 * Duplicate case label System.out.println("Another case for two."); break;
		 * default: System.out.println("Default case."); break; }
		 */

		// Using switch with return statements
		System.out.println("\nUsing switch with return statements:");
		int result = getDayNumber("Friday");
		System.out.println("Day number: " + result);
	}

	// Example of using switch with return statements
	public static int getDayNumber(String day) {
		switch (day) {
		case "Monday":
			return 1;
		case "Tuesday":
			return 2;
		case "Wednesday":
			return 3;
		case "Thursday":
			return 4;
		case "Friday":
			return 5;
		default:
			return 0; // Default return value if day does not match any case
		}
	}

	public static void printDayName(int dayNumber) {
		System.out.println("Day name for number " + dayNumber + ":");

		switch (dayNumber) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		default: //The default case can be positioned anywhere in the switch statement. It will execute if none of the preceding case labels match the expression.
			System.out.println("Invalid day number. Please enter a number between 1 and 7.");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		}
	}
}
