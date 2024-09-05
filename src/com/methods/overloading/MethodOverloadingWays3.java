package com.methods.overloading;

public class MethodOverloadingWays3 {

	// Changing the Order of the Parameters

	void calculate(int a, double b) {
		System.out.println("int and double: " + a + ", " + b);
	}

	// Overloaded method with double, int parameters
	void calculate(double a, int b) {
		System.out.println("double and int: " + a + ", " + b);
	}

	public static void main(String[] args) {
		MethodOverloadingWays3 obj = new MethodOverloadingWays3();
		obj.calculate(5, 10.5); // Calls method with int, double
		obj.calculate(10.5, 5); // Calls method with double, int
	}
}
