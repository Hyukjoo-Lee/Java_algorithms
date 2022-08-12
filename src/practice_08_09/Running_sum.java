package practice_08_09;

public class Running_sum {
	
	public static void main(String[] args) {
		// Test
		int[] arr = {1,2,3,4};
		runningSum(arr);
	}
	
	public static int[] runningSum(int[] nums) {
		int[] ans = new int[nums.length];
		// ans[0] = nums[0];
		// ans[1] = nums[0] + nums[1]
		// ans[2] = nums[0] + nums[1] + nums[2]...
		
		for (int i = 0; i < ans.length; i++) {
			if(i == 0) {
				ans[i] = nums[i];
			} else {
				ans[i] = ans[i-1] + nums[i];
			}
		}
		
		// Print the array to be returned
		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i] + " ");
		}
		
		return nums;
	}

}