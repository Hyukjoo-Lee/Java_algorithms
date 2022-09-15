package practice_09_08;

public class BinarySearch {

	public static void main(String[] args) {
		int[] nums = { -1, 0, 3, 5, 9, 12 };
		int target = 9;
		System.out.println(search(nums, target));
	}

	public static int search(int[] nums, int target) {

		int left = 0;
		int right = nums.length - 1;
		int mid = 0;

		// We can see there is no more target when left index is bigger than right index.
		while (left <= right) {

			mid = (left + right) / 2;

			/**
			 * Condition 1. if middle value is equal to target value, return the index
			 * Condition 2. if middle value is smaller than target value, focus on the left side
			 * Condition 3. if middle value is bigger than target value, focus on the right side
			 */
			if (nums[mid] == target) {
				return mid;
			} else if (nums[mid] < target) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}

		return -1;

	}
}
