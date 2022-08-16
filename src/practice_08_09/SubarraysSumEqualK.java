package practice_08_09;

import java.util.HashMap;

/**
 * Leetcode 560; prefixSum problem 
 *
 */
public class SubarraysSumEqualK {

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3 };
		int k = 3;
		System.out.println(subarraySum_3(nums, k));
	}

	// Using Brute force
	public static int subarraySum_1(int[] nums, int k) {
		int count = 0;
		for (int start = 0; start < nums.length; start++) {
			for (int end = start + 1; end <= nums.length; end++) {
				int sum = 0;
				for (int i = start; i < end; i++)
					sum += nums[i];
				if (sum == k)
					count++;
			}
		}
		return count;
	}

	// Using Sum(nums[i,j]) = prefixSum[j] - prefixSum[i-1]
	public static int subarraySum_2(int[] nums, int k) {

		int count = 0;
		int[] sum = new int[nums.length + 1];

		sum[0] = 0;

		for (int i = 1; i <= nums.length; i++)
			sum[i] = sum[i - 1] + nums[i - 1];

		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j <= nums.length; j++) {
				if (sum[j] - sum[i] == k)
					count++;
			}
		}
		return count;
	}

	// Using HashMap
	public static int subarraySum_3(int[] nums, int k) {
		int count = 0, sum = 0;
		HashMap<Integer, Integer> map = new HashMap<>();
		map.put(0, 1);
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
			if (map.containsKey(sum - k))
				count += map.get(sum - k);
			map.put(sum, map.getOrDefault(sum, 0) + 1);
		}
		return count;
	}

}
