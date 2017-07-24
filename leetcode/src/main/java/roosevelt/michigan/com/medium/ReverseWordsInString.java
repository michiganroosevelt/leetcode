package roosevelt.michigan.com.medium;

/**
 * 
 * @author soup
 *
 */
public class ReverseWordsInString {

    public String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuffer sb = new StringBuffer();
        String space = "";
        for( int i = words.length-1; i >= 0; i--){
        	sb.append(space + words[i]);
        	space = " ";
        }
    	
    	return sb.toString();
    }
	
}
