package practice_09_13;

import java.util.Stack;

public class IsPalindrome {

	public static void main(String[] args) {
		String s = "race a car";

		System.out.println(isPalindrome_2(s));

	}

	/**
	 * Time complexity is 0(n); 2 loops not nested.
	 * But runtime will be pretty long.
	 */
	public static boolean isPalindrome(String s) {

		// Covert all chars in a given string into lower cases
		String t = s.toLowerCase();
		
		String reveredStr = "";
		// Define a string builder to make a comparable string (should be all lower
		// cases & numeric chars)
		StringBuilder sb = new StringBuilder();

		// Initialize Stack<Character>, we will use push & pop functions
		Stack<Character> stack = new Stack<>();

		for (int i = 0; i < t.length(); i++) {
			// Remove all non-alphanumeric characters, and append each chars to the String
			// builder
			if (Character.isLetterOrDigit(t.charAt(i))) {
				stack.push(t.charAt(i));
				sb.append(t.charAt(i));
			}
		}

		while (!stack.isEmpty())
			reveredStr += stack.pop();
		
		return reveredStr.equals(sb.toString());

	}

	/**
	 * Time complexity is 0(n); 1 loop only.
	 * Runtime is shorter than the first approach.
	 */
	public static boolean isPalindrome_2(String s) {
		
		// Initialize reversed string and String builder
		String reversedStr = "";
		StringBuilder sb = new StringBuilder();
		
		// Convert the string into a char array because we are gonna check if the each chars is letter or digit also covert all into lower cases
		char[] chArr = s.toCharArray();
		
		for(int i = 0; i < chArr.length; i++) {
			if(Character.isLetterOrDigit(chArr[i])) {
				sb.append(Character.toLowerCase(chArr[i]));
			}
		}
		
		// New array which is filtered.
		String newStr = sb.toString();
		// Reverse the string builder
		reversedStr = sb.reverse().toString();

		return newStr.toString().equals(reversedStr);
	}

}
