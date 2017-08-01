
package roosevelt.michigan.com.easy;

import java.util.List;

/**
 * 
 * @author soup
 *
 */
public class ValidWordSquare {

    public boolean validWordSquare(List<String> words) {
    	try {
        	for( int i = 0; i < words.size(); i++ ) {
        		for(int j = 0; j < words.get(i).length(); j++ ){
        			
        			if( words.get(i).charAt(j) != words.get(j).charAt(i)) {
        				return false;
        			}
        		}
        	}
    	} catch (Exception e ) {
    		return false;
    	}
        
        return true;
    }
   
}

