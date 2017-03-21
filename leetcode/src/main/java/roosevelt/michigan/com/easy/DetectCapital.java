package roosevelt.michigan.com.easy;

/**
 * Given a word, you need to judge whether the usage of capitals in it is right
 * or not.
 * 
 * We define the usage of capitals in a word to be right when one of the
 * following cases holds:
 * 
 * All letters in this word are capitals, like "USA". All letters in this word
 * are not capitals, like "leetcode". Only the first letter in this word is
 * capital if it has more than one letter, like "Google".
 * 
 * Otherwise, we define that this word doesn't use capitals in a right way.
 * 
 * @author soup
 *
 */
public class DetectCapital {

    public boolean detectCapitalUse(String word) {
    	if( word.length() == 1 ) {
    		return true;
    	}
    	
    	boolean foundUpperCase = false;
    	boolean foundLowerCase = false;
    	boolean isFirstLetterUpperCase = false;
    	
    	for( int i = 0; i < word.length(); i++) {
    		int letter = (int)word.charAt(i);
    		if( letter >= 65 && letter <= 90) {
    			if( i == 0 ) {
    				isFirstLetterUpperCase = true;
    			} else {
        			foundUpperCase = true;
    			}
    		} else {
    			foundLowerCase = true;
    		}
    	}

    	boolean allUpper = isFirstLetterUpperCase && foundUpperCase && !foundLowerCase;
    	boolean firstUpper = isFirstLetterUpperCase && !foundUpperCase && foundLowerCase;
    	boolean allLower = !isFirstLetterUpperCase && !foundUpperCase && foundLowerCase;
    	
    	return allUpper || firstUpper || allLower;
    }
}
