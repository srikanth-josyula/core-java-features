package com.objects.creation;

import java.lang.reflect.Constructor;


//Using Reflection (Constructor.newInstance())
public class UsingConstructorInstance {

	private UsingConstructorInstance() {
		System.out.println("UsingConstructorInstance created");
	}

	public static void main(String[] args) {
		try {
			// Obtain the Constructor object for the UsingConstructorInstance class
			Constructor<UsingConstructorInstance> constructor = UsingConstructorInstance.class.getDeclaredConstructor();

			UsingConstructorInstance obj1 = constructor.newInstance();
			System.out.println("Hashcode for obj1: " + System.identityHashCode(obj1));

			UsingConstructorInstance obj2 = constructor.newInstance();
			System.out.println("Hashcode for obj2: " + System.identityHashCode(obj2));

			// Comparing the objects obj1 and obj2 are different instances, each occupying a different memory location.
			System.out.println("Objects are same: " + (obj1 == obj2)); // false, different references
			//checks if obj1 and obj2 are the same instance (which they are not).
			System.out.println("Objects are equal: " + obj1.equals(obj2)); // false, based on default equals()  implementation

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
