package com.arrays.sorting;

import java.util.Arrays;

public class ArraysMethod {

	public static void main(String[] args) {
		/**
		 * Using Array class
		 **/
		// Time Complexity:O(nlogn) in the average case and worst case.
		// Space Complexity: O(n) due to the additional space required for merging and
		// storing sorted segments.
		int[] arr1 = { 2, 5, 1, 4, 3 };
		Arrays.sort(arr1);
		System.out.println("Sorted array: " + Arrays.toString(arr1));

		int[] arr2 = { 5, 3, 8, 4, 2 };
		System.out.println("Original array: " + Arrays.toString(arr2));
	}
}
