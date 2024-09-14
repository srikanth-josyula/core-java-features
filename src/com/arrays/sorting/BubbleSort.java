package com.arrays.sorting;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = { 2, 5, 1, 4, 3 };

		int n = arr.length; // Get the length of the array

		// Step 3: Outer loop - controls the number of passes
		for (int i = 0; i < n - 1; i++) {
			// We do n-1 passes because after each pass, the largest element is in place

			System.out.println("\nStarting Pass " + (i + 1)); // Print which pass we are on

			// Step 4: Inner loop - compares adjacent elements
			for (int j = 0; j < n - i - 1; j++) {
				// We reduce the range by i because the last i elements are already sorted

				System.out.println("Comparing arr[" + j + "] = " + arr[j] + " and arr[" + (j + 1) + "] = " + arr[j + 1]);

				// Step 5: Compare adjacent elements
				if (arr[j] > arr[j + 1]) {
					// Step 6: Swap if the current element is greater than the next element
					System.out.println("Swapping arr[" + j + "] = " + arr[j] + " and arr[" + (j + 1) + "] = " + arr[j + 1]);
					
					// Perform the swap
					int temp = arr[j];        // Store the current element in a temporary variable
					arr[j] = arr[j + 1];      // Move the next element into the current position
					arr[j + 1] = temp;        // Place the stored element in the next position


					// Print the array after the swap
					System.out.println("Array after swap: " + Arrays.toString(arr));
				} else {
					System.out.println("No swap needed"); // If no swap happens
				}
			}

			// Step 7: Print the array after each pass
			System.out.println("Array after Pass " + (i + 1) + ": " + Arrays.toString(arr));
		}

	}
}
