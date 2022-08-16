package practice_08_06;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * that, given an array A of N integers, returns the smallest positive integer
 * (greater than 0) that does not occur in A.
 * 
 * For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.
 * 
 * Given A = [1, 2, 3], the function should return 4.
 * 
 * Given A = [−1, −3], the function should return 1.
 * 
 * Write an efficient algorithm for the following assumptions:
 * 
 * N is an integer within the range [1..100,000]; each element of array A is an
 * integer within the range [−1,000,000..1,000,000].
 * 
 * @author "HyukjooLee"
 */
public class Positive_integer {

	public static void main(String[] args) {
		int[] arrA = {1, 2, 3}; // To test 
		int i = returnSmallestNumber(arrA);
		System.out.print(i);
	}
	
	/**
	 * Answer
	 */
	private static int returnSmallestNumber(int[] arr) {
		
		int returnNum = 0;
		int N = arr.length;
		
		Set<Integer> set = new HashSet<>();
		
		for (Integer integer : arr) {
			if(integer > 0) {
				set.add(integer);
			}
		}
		
		for (int i = 1; i <= N + 1; i++) {
			if(!set.contains(i)) 			
				returnNum = i;
		}
		
		return returnNum;
		
	}
	
	private static void showSmallestNum() {
		int[] arrA = {-1,1,5,3,7,6,4,10,2,8,-10}; // To test 
		int returnNum; // the smallest number
		
		// Sort arrA
		Arrays.sort(arrA);
		
		// 비교하기 위한 임의 hash set 
		Set<Integer> set = new HashSet<>();
		
		for (int i = 0; i < arrA.length; i++) {
			// positive number
			if(arrA[i] > 0) {
				set.add(arrA[i]);
//				System.out.println(arrA[i]);
			}
		}
		
		for (returnNum = 1; returnNum < arrA.length + 2; returnNum++) {
			if (!set.contains(returnNum)) 
				System.out.println(returnNum);				
		}
	}
}