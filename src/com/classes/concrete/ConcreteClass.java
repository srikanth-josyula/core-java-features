package com.classes.concrete;

public class ConcreteClass {
	
	public static int total(int val1, int val2) {
		return val1 + val2;
	}

	public static void main(String args[]) {
		int sum = total(100, 108);
		System.out.println("Total of two integers: " + sum);
	}
}
