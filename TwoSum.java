/*
 * Given an array of integers nums and an integer target, return the indices of the two numbers such that they add up to the target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.
*
*Input: nums = [2, 7, 11, 15], target = 9
*Output: [0, 1]
*
*
*Brute force: 2 Loops => Time Complexity: O(n²) - Space Complexity: O(1)
*
*/

//Best solution: Use of HashMap (Time: O(n) and Space: O(11))

 public class TwoSum {

 	public int[] twoSum(int[] nums, int target) {

 		Map<Integer Integer> map = new HashMap<>();

 		for (int i = 0; i < nums.length; i++) {
 			int complement = target - nums[i];
 			if (map.containsKey(complement)) {
 				return new int[] {map.get(complement), i};
 			}
 			map.put(nums[i], i);
 		}

 		throw new IllegalArgumentException("No two sum solution");
 	}
 } 