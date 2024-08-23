package com.objects.creation;

import java.io.*;

public class UsingSerializable implements Serializable {

	private static final long serialVersionUID = 1L; // Unique identifier for the class

	public static void main(String[] args) {
		UsingSerializable obj1 = new UsingSerializable();

		// Serialization: Saving the object to a file
		try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("object.dat"))) {
			out.writeObject(obj1);
			System.out.println("Object has been serialized");
			System.out.println("Hashcode for obj1: " + System.identityHashCode(obj1));
		} catch (IOException e) {
			e.printStackTrace();
		}

		// Deserialization: Reading the object from a file
		UsingSerializable obj2 = null;
		try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("object.dat"))) {
			obj2 = (UsingSerializable) in.readObject();
			System.out.println("Object has been deserialized");
			System.out.println("Hashcode for obj2: " + System.identityHashCode(obj2));
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}

		// Comparing the objects obj1 and obj2 are different instances, each occupying a different memory location.
		System.out.println("Objects are same: " + (obj1 == obj2)); // false, different references
		// checks if obj1 and obj2 are the same instance (which they are not).
		System.out.println("Objects are equal: " + obj1.equals(obj2)); // false, based on default equals() implementation
	}

	@Override
	public String toString() {
		return "UsingSerializable{}";
	}
}
