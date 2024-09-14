package com.arrays;

public class ArrayBaseMemory {

	public static void main(String[] args) {

		// a continuous memory block is allocated in the heap
		int[] arr = { 1, 2, 3 };

		System.out.println(System.identityHashCode(arr)); // 498931366

		System.out.println(System.identityHashCode(arr[0])); // 112023002
		System.out.println(System.identityHashCode(arr[1])); // 879505317
		System.out.println(System.identityHashCode(arr[2])); // 1464462612
	}

}
