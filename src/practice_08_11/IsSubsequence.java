package practice_08_11;

public class IsSubsequence {

	public static void main(String[] args) {
		String s = "abc";
		String t = "ahbgdc";
			
		System.out.println(isSubsequence(s, t));
	}
	
	
	public static boolean isSubsequence(String s, String t) {
		
		// every characters of a string can be presented in the another string
        // should be one direction; position should be consistent
		int i = 0; 
		int j = 0;
		
        while(i < s.length() && j < t.length()){
           if(s.charAt(i) == t.charAt(j)){
               i++;
               j++;
           } else{
               j++;
           }
        }
        return i == s.length();
	    }
	}

