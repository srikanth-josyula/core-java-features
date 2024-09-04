package com.oops;

//Base class
class BaseClass {
	
	// Method for compile-time polymorphism
	void printSomething() {
		System.out.println("printSomething at BaseClass");
	}
}

//Derived class for compile-time polymorphism (method overloading)
class DerivedClass extends BaseClass {

	// Method overloading
	void printSomething(String msg) {
		System.out.println("printSomething with value as "+msg);
	}

	// Method overriding for runtime polymorphism
	@Override
	void printSomething() {
		System.out.println("printSomething at DerivedClass");
	}
}

//Another derived class for runtime polymorphism
class DerivedClass2 extends BaseClass {
	
	@Override
	void printSomething() {
		System.out.println("printSomething at DerivedClass2");
	}
}

public class PolymorphismExample {
	public static void main(String[] args) {
		
		// Compile-time polymorphism (method overloading)
		DerivedClass cls1 = new DerivedClass();
		cls1.printSomething(); 					//printSomething at DerivedClass	
		cls1.printSomething("Hello");			//printSomething with value as Hello

		// Runtime polymorphism (method overriding)
		BaseClass bsCls;

		bsCls = new DerivedClass();
		bsCls.printSomething(); 				//printSomething at DerivedClass

		bsCls = new DerivedClass2();
		bsCls.printSomething(); 				//printSomething at DerivedClass2
	}
}
