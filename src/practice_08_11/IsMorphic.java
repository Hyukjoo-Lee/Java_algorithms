package practice_08_11;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class IsMorphic {
	
	public static void main(String[] args) {
		String s = "title";
		String t = "paper";
			
		System.out.println(isIsomorphic(s, t));
	}
	
	
	public static boolean isIsomorphic(String s, String t) {
		
        Map<Character, Character> map = new HashMap<>();
		Set<Character> assignedValues = new HashSet<>();
		
		for (int i = 0; i < s.length(); i++) {
			if (map.containsKey(s.charAt(i)) && map.get(s.charAt(i)) != t.charAt(i)) {
				return false;
			}
			if(!map.containsKey(s.charAt(i)) && assignedValues.contains(t.charAt(i))) {
				return false;
			}
			map.put(s.charAt(i), t.charAt(i));
			assignedValues.add(t.charAt(i));
			
		}
		
		return true;
   }
}
