package com.methods;

public class StaticMethodExample {

	static {
		staticVar = "Static-dummy";
		System.out.println("Inside Static block");
	}

	String instanceVar = "dmmy";
	static String staticVar = "dmmy";

	static void myStaticMethod() {
		System.out.println("Static method called");
	}

	static void myStaticMethod2() {
		int localVar = 10; // Stored in stack
		System.out.println("Method Local variable: " + localVar);
		System.out.println("Class Local varibale: " + instanceVar); // ERROR - Cannot make a static reference to the
																	// non-static field msg
		System.out.println("Class static variable: " + staticVar);
	}
	
	void instanceMethod() {
        System.out.println("Instance method invoked");
    }

	public static void main(String[] args) {
		StaticMethodExample.myStaticMethod(); // Call static method without object

		System.out.println(StaticMethodExample.staticVar); // Static Variables Shared Among Instances

		StaticMethodExample.myStaticMethod(); // Slightly faster due to no object state access
		
		StaticMethodExample obj = new StaticMethodExample();
		obj.instanceMethod(); // Instance method involves object state slightly slow
	}

}

class StaticInnerClass extends StaticMethodExample {

	@Override
	static void myStaticMethod() { // ERROR - Static methods cannot be overridden in the same way as instance
									// methods
		System.out.println("Static method called");
	}

}
