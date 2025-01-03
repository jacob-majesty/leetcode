/*
*Challenge: MERGE TWO SORTED ARRAYS
Suppose you are given two sorted arrays of integers. If one array has enough empty
entries at its end, it can be used to store the combined entries of the two arrays in
sorted order. For example, consider (5,13,17, J) and (3,7,11,19), where ~
denotes an empty entry. Then the combined sorted entries can be stored in the first
array as (3,5, 7,11,13,17,19, „).
Write a program which takes as input two sorted arrays of integers, and updates the
first to the combined entries of the two arrays in sorted order. Assume the first array
has enough empty entries at its end to hold the result.
*/

// Time complexity O(m + n) | Space complexity O(1)

public class MergeSortedArrays {

	public static void merge(int[] arr1, int m, int[] arr2, int n) {

		int i = m - 1;
		int j = n - 1;
		int k = m + n - 1;

		while (i >= 0 && j >= 0) {
			if (arr1[i] > arr2[j]) {
				arr1[k] = arr1[i];
				i--;
			} else {
				arr1[k] = arr2[j];
				j--;
			}
			k--;
		}

		while (j >= 0) {
			arr1[k] = arr2[j];
			j--;
			k--;
		}
	}
}