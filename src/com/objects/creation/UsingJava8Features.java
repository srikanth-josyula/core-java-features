package com.objects.creation;

import java.util.function.Supplier;

public class UsingJava8Features {
	public static void main(String[] args) {
		
		// Using Supplier to create an instance of MyClass
		Supplier<UsingJava8Features> supplier = UsingJava8Features::new;

		// Get a new instance from the supplier
		UsingJava8Features obj1 = supplier.get();
		System.out.println("Hashcode for obj1: " + System.identityHashCode(obj1));

		UsingJava8Features obj2 = supplier.get();
		System.out.println("Hashcode for obj2: " + System.identityHashCode(obj2));

		// Comparing the objects obj1 and obj2 are different instances, each occupying a
		// different memory location.
		System.out.println("Objects are same: " + (obj1 == obj2)); // false, different references
		// checks if obj1 and obj2 are the same instance (which they are not).
		System.out.println("Objects are equal: " + obj1.equals(obj2)); // false, based on default equals() implementation
	}
}
