/**
 * Challenge: Suppose you were asked to write a program which takes an array of positive
integers and returns the smallest number which is not to the sum of a subset of
elements of the array. 

 * Explanation: Suppose a collection of numbers can produce
every value up to and including V, but not V+1. Now consider the effect of adding
a new element u to the collection. If u < V +1, we can still produce every value up to
and including V+u and we cannot produce V+u+1. On the other hand, if u > V+l,
then even by adding u to the collection we cannot produce V+l.

* Let M[i-1] be the maximumconstructible amount from the first i elements of the sorted array. 
If the next array element x is greater than M[i — 1] + 1, 
M[i- 1] is still the maximum constructible amount, so we
stop and return M[i-1] +1 as the result. Otherwise, we set M[i] = M[i -1] + x and
continue with element (i + 1).
 * 
 * */

public static int smallestNonConstructibleValue (List<Integer> givenArray) {
	Collections.sort(givenArray); // O(nlogn)
	int maxContructibleValue = 0;

	for (int a: givenArray) {     // O(n)
		if (a > maxContructibleValue + 1) {
			break;
		} 
		maxContructibleValue += a;
	}
	return maxContructibleValue + 1;
}


