package com.objects.constructors;

public class CopyConstructor {

	private final int[] data; //If a field is declared as final, the copy constructor can change it.

	CopyConstructor(int[] data) {
		this.data = data;
		System.out.println("Invoked Normal Constructor " + java.util.Arrays.toString(this.data)); //[1, 2, 3]
	}

	CopyConstructor(CopyConstructor obj) {
		this.data = obj.data;
		this.data[2] = this.data[2]+20;
		System.out.println("Invoked Normal Constructor " + java.util.Arrays.toString(this.data)); //  [1, 2, 23]
	}

	public int[] getData() {
		return data; // Returning the reference to the original array
	}

	public static void main(String[] args) {
		int[] originalData = { 1, 2, 3 }; // Create an array

		CopyConstructor original = new CopyConstructor(originalData);
		System.out.println("Normal Constructor " + System.identityHashCode(original)); // 498931366

		CopyConstructor copy = new CopyConstructor(original);
		System.out.println("Normal Constructor " + System.identityHashCode(copy)); // 2060468723

		System.out.println("Original data: " + java.util.Arrays.toString(original.getData())); //Original data: [1, 2, 23]
		System.out.println("Copy data: " + java.util.Arrays.toString(copy.getData())); //Copy data: [1, 2, 23]

	}

}
