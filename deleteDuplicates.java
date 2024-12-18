/**
 * Challenge: This problem is concerned with deleting repeated elements from a sorted array.
For example, for the array (2,3,5,5,7,11,11,11,13), then after deletion, the array is
(2,3,5,7,11,13,0,0,0). After deleting repeated elements, there are 6 valid entries.
There are no requirements as to the values stored beyond the last valid element.
Write a program which takes as input a sorted array and updates it so that all dupli¬
cates have been removed and the remaining elements have been shifted left to fill the
emptied indices. Return the number of valid elements

* Here is a brute-force algorithm that uses0(1) additional space—iterate through A,
testing if A[i] equals A[i + 1], and, if so, shift all elements at and after i+ 2 to the left
by one. When all entries are equal, the number of shifts is (n-1) + (n-2) +...+2 + 1,
i.e., 0(n2), where n is the length of the array.

*The intuition behind achieving a better time complexity is to reduce the amount of
shifting. Since the array is sorted, repeated elements must appear one-after-another,
so we do not need an auxiliary data structure to check if an element has appeared
already. We move just one element, rather than an entire subarray, and ensure that
we move it just once
*
*/

// The time complexity is0(n),and the space complexity is0(1)

public static int deleteDuplicates(List<Integer> givenArray) {
	if (givenArray.isEmpty()) {
		return 0;
	}

	int writeIndex = 1;
	for (int i = 1; i < givenArray.size(); ++i) {
		if (!givenArray.get(writeIndex - 1).equals(givenArray.get(i))) {
			givenArray.set(writeIndex++, givenArray.get(i));
		}
	}
	return writeIndex;