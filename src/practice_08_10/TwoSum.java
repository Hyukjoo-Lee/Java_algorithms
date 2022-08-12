package practice_08_10;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    // Simple Approach
//    public int[] twoSum(int[] nums, int target) {
//    	for (int i = 0; i < nums.length; i++) {
//			for (int j = i + 1; j < nums.length; j++) {
//				if (nums[j] == target - nums[i]) {
//					return new int[] {i,j};
//				}
//			}
//		}
//    	return null;
//    }
    
	// Using HashMap
    public int[] twoSum(int[] nums, int target) {
    	Map<Integer, Integer> map = new HashMap<>();
    	for (int i = 0; i < nums.length; i++) {
    		int current = nums[i];
    		// current + x = target
    		int x = target - current;
    		if(map.containsKey(x)) {
    			return new int[] {map.get(x), i};
    		}
    		map.put(current, i);
		}
    	return null;
    }
    
	public static void main(String[] args) {
		TwoSum ts = new TwoSum();
		int[] nums = {2,7,11,15};
		int target = 9;
		
		int[] i = ts.twoSum(nums, target);
				
		System.out.println(Arrays.toString(i));		
	}
	
	
}