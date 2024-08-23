package com.objects.creation;

/**
 * 
 * Allows for the creation of instances of classes where the class type is not
 * known until runtime. Useful for scenarios like plugin systems or factories.
 * 
 * The type of the object is determined at runtime. This introduces the
 * possibility of ClassCastException if not handled correctly.
 **/
public class UsingClassForName {

	public static void main(String[] args) {
		try {
			// Dynamically load the class at runtime into JVM
			Class<?> clazz = Class.forName("com.objects.creation.UsingClassForName");

			System.out.println("Class loaded: " + clazz.getName());

			// Creates an instance of the dynamically loaded class. This approach is part of
			// Java's reflection API.(Class.newInstance()):
			UsingClassForName obj1 = (UsingClassForName) clazz.getDeclaredConstructor().newInstance();
			UsingClassForName obj2 = (UsingClassForName) clazz.getDeclaredConstructor().newInstance();

			System.out.println("Hashcode for obj1: " + System.identityHashCode(obj1)); // 1450495309
			System.out.println("Hashcode for obj1: " + System.identityHashCode(obj2)); // 1670782018

			System.out.println("Object are Same: " + obj1.equals(obj2)); // false
			System.out.println("Object are Same: " + (obj1 == obj2)); // false

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
