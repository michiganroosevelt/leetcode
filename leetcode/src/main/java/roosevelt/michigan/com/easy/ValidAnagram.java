package roosevelt.michigan.com.easy;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * 
 * Given two strings s and t, write a function to determine if t is an anagram
 * of s.
 * 
 * For example, s = "anagram", t = "nagaram", return true. s = "rat", t = "car",
 * return false.
 * 
 * Note: You may assume the string contains only lowercase alphabets.
 * 
 * @author soup
 *
 */
public class ValidAnagram {

	public boolean isAnagram(String s, String t) {
		if (s.length() != t.length()) {
			return false;
		}
		
		Map<Character, Integer> sMap = new HashMap<>();
		Map<Character, Integer> tMap = new HashMap<>();

		long characterSum = 0;
		for (int i = 0; i < s.length(); i++) {
			char sChar = s.charAt(i);
			char tChar = t.charAt(i);
			
			if( sMap.containsKey(sChar)) {
				sMap.put(sChar, sMap.get(sChar).intValue()+1);
			} else {
				sMap.put(sChar, 1);
			}

			if( tMap.containsKey(tChar)) {
				tMap.put(tChar, tMap.get(tChar).intValue()+1);
			} else {
				tMap.put(tChar, 1);
			}
		}
		
		Iterator<Character> sKeys = sMap.keySet().iterator();
		while( sKeys.hasNext() ) {
			char sKey = sKeys.next();
			if( !tMap.containsKey(sKey) || sMap.get(sKey).intValue() != tMap.get(sKey) ){
				return false;
			}
		}
		

		return characterSum == 0;
	}

}
