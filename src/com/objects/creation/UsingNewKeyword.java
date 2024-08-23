package com.objects.creation;

/**
 * Directly creates an object of the specified class type. The type of the
 * object is known at compile time, which ensures type safety and allows for
 * compile-time type checking.
 **/
public class UsingNewKeyword {

	public static void main(String[] args) {

		UsingNewKeyword obj1 = new UsingNewKeyword();
		UsingNewKeyword obj2 = new UsingNewKeyword();

		// The class being instantiated is known at compile time.
		System.out.println("Hashcode for obj1: " + System.identityHashCode(obj1)); // 140435067
		System.out.println("Hashcode for obj1: " + System.identityHashCode(obj2)); // 1450495309

		System.out.println("Object are Same: " + obj1.equals(obj2)); // false
		System.out.println("Object are Same: " + (obj1 == obj2)); // false
	}

}
