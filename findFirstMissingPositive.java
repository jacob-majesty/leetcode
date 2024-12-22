
 // Solution
public static findDirstMissingPositive(int[] A) {
	int i = 0;

	while (i < A.size) {
		if (A.get(i) > 0 && A.get(i) <= A.size() && A.get(i) != A.get(A.get(i)-1)) {
			Collections.swap(A, i, A.get(i)-1)
		} else {
			i++;
		}

		for (i = 0; i < A.size(); ++i) {
			if (A.get(i) != i+1) {
				return i+1;
			}
		}
	return A.size()+1;
	}
}

/**
 * Challenge: Let A be an array of length n. Design an algorithm to find the smallest positive integer
which is not present in A. You do not need to preserve the contents of A. For example,
if A = (3,5,4, —1,5,1,-1), the smallest positive integer not present in A is 2.
 * 
 * Brute Force: We can use sorting O(nlogn) time complexity | O(1) space complexity 
 * 				or a Hash table by having an extra space O(n) 
 *  
 * Solution: To reduce the space complexity, Instead of using an external hash table to store the set of positive integers,
we can use A itself. Specifically, if A contains k between 1 and n, we set A[k-1] to
k. (We use k—1 because we need to use all n entries, including the entry at index 0, which will be used to record the presence of 1.) Note that we need to save the
presence of the existing entry in A[k-1] if it is between 1 and n. Because A contains n
entries, the smallest positive number that is missing in A cannot be greater than n+1.

*For example, let A = (3,4,0,2), n = 4. we begin by recording the presence of 3
by writing it in A[3- 1]; we save the current entry at index 2 by writing it to A[0].
Now A = (0,4,3, 2). Since 0 is outside the range of interest, we advance to A[l], i.e.,
4, which is within the range of interest. We write 4 in A[4-1], and save the value at
that location to index 1, and A becomes (0, 2,3, 4). The value at A[l] already indicates
that a 2 is present, so we advance. The same holds for A[2] and A[3],
Now we make a pass through A looking for the first index i such that A[i] # i+1;
this is the smallest missing positive entry, which is 1 for our example. 
 * 
 * /