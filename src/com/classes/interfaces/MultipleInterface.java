package com.classes.interfaces;

public class MultipleInterface implements B, C {

	
	
	public static void main(String[] args) {
		MultipleInterface obj = new MultipleInterface();
        obj.doSomething(); // This will call D's implementation of doSomething()
    }
}

//Define a common interface with a method
interface A {
	void doSomething();
}

//Define another interface extending the first interface
interface B extends A {
	@Override
	default void doSomething() {
		System.out.println("B's implementation of doSomething()");
	}
}

//Define a third interface extending the first interface
interface C extends A {
	@Override
	default void doSomething() {
		System.out.println("C's implementation of doSomething()");
	}
}
