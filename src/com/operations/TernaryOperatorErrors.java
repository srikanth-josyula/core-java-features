package com.operations;

public class TernaryOperatorErrors {

	public static void main(String[] args) {
		int a = 5;
		String b = "Hello";
		int x = 5;
		int y = 10;
		int z = 20;

		// Don't : Don't Use Different Return Types in the Expressions:
		Object result = (a > 3) ? a : b; // works without a compile-time error in Java, despite using incompatible types
											// (int and String), is due to implicit type promotion
		System.out.println(result);

		// Compile error: ternary operator used for side effects
		// The ternary operator should return a value, not execute statements.
		 (a > 3) ? System.out.println("Greater") : System.out.println("Lesser"); //Error: Invalid use of ternary

		// Nested ternary operations are hard to read and maintain. Use if-else for complex conditions.
		String result2 = (x > 5) ? (y > 10 ? "x and y large" : "x large, y small") : "x small";
		System.out.println(result2);
		
		// Overuse of the ternary operator can make code hard to understand 
		String result3 = (x > y) ? "x is larger" : (y > z) ? "y is larger" : "z is largest";
		
		//In cases where readability is key (such as in large teams or complex projects), using an if-else statement may be clearer.
		boolean flag = true;
		int result = flag ? 1 : 0;
		// vs
		if (flag) {
		    result = 1;
		} else {
		    result = 0;
		}
	}
}
