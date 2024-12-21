/**
 * 
The Kadane Algorithm is an efficient way to solve the maximum subarray sum problem. 
It works by finding the contiguous subarray within a one-dimensional array of numbers that has the largest sum.
This algorithm operates in 𝑂(𝑛)time complexity and O(1) space complexity
 * 
 */


public static int maxSubArraySum(int[] nums) {

	int maxCurrent = nums[0];
	int maxGlobal = nums[0];
	for (int i = 0; i < nums.length; i++) {
		maxCurrent = Math.max(nums[i], nums[i] + maxCurrent)
	
		if (maxGlobal < maxCurrent) {
			maxGlobal = maxCurrent;
		}
		
	return maxGlobal;
   }

}