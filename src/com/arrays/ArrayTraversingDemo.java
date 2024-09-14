package com.arrays;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayTraversingDemo {

	/**
	 * The time complexity is O(n) for all methods. The space complexity typically
	 * remains constant (i.e., O(1)) except where noted.
	 **/

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5 };

		/**
		 * Simple For Loop
		 **/
		// The loop runs from i = 0 to i < arr.length.
		// Each element is visited once, so the time complexity is O(n)
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		/**
		 * Enhanced For Loop
		 **/
		// Enhanced for loop iterates over each element in the array.
		// Each element is visited once, so the time complexity is O(n)
		for (int value : arr) {
			System.out.println(value);
		}

		/**
		 * Using Java Streams
		 **/
		// Streams provide a functional approach to traverse arrays.
		// Each element is processed once, so the time complexity is O(n)
		Arrays.stream(arr).forEach(System.out::println);

		/**
		 * Using Recursive Traversal
		 **/
		// Recursive method prints array elements.
		// Time complexity is O(n) due to n recursive calls.
		// Space complexity is O(n) due to the call stack.
		printArrayRecursive(arr, 0);

		/**
		 * Using Iterator (after converting to List)
		 **/
		// Converting array to List and using an iterator to traverse.
		// Time complexity is O(n) for both conversion and iteration.
		// Space complexity is O(n) due to additional space for List and iterator.
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5); // Convert to List
		Iterator<Integer> iterator = list.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		/**
		 * Using While Loop
		 **/
		// While loop iterates through array elements.
		// Each element is visited once, so the time complexity is O(n)
		int i = 0;
		while (i < arr.length) {
			System.out.println(arr[i]);
			i++;
		}
	}

	/**
	 * Recursive method to print array elements.
	 * 
	 * @param arr   Array of integers.
	 * @param index Current index to print.
	 */
	private static void printArrayRecursive(int[] arr, int index) {
		if (index >= arr.length) {
			return;
		}
		System.out.println(arr[index]);
		printArrayRecursive(arr, index + 1);
	}
}
