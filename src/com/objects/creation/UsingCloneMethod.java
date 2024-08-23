package com.objects.creation;

public class UsingCloneMethod implements Cloneable {

	public static void main(String[] args) throws CloneNotSupportedException {

		UsingCloneMethod obj1 = new UsingCloneMethod();

		// The clone() method in Java is used to create a new object that is a copy of
		// the existing object
		UsingCloneMethod obj2 = (UsingCloneMethod) obj1.clone();

		System.out.println("Hashcode for obj1: " + System.identityHashCode(obj1)); // 140435067
		System.out.println("Hashcode for obj1: " + System.identityHashCode(obj2)); // 1450495309

		// By default, the equals() method from the Object class compares object
		// references, so it behaves similarly to == unless overridden.
		System.out.println("Object are Same: " + obj1.equals(obj2)); // false
		System.out.println("Object are Same: " + (obj1 == obj2)); // false
	}

	@Override
	public Object clone() {
		try {
			return super.clone(); // Perform the cloning operation
		} catch (CloneNotSupportedException e) {
			throw new RuntimeException("Cloning not supported", e);
		}
	}

	@Override
	public boolean equals(Object obj) {
		return this == obj; // Default implementation (identity check)
	}

	@Override
	public String toString() {
		return "UsingCloneMethod{}";
	}
}
