package roosevelt.michigan.com.easy;

public class MaxConsecutiveOnes {

    public int findMaxConsecutiveOnes(int[] nums) {
    	int maxOnes = 0;
    	int currentOnes = 0;
    	for( int i = 0; i < nums.length; i++ ) {
    		if( nums[i] == 1) {
    			currentOnes++;
    		} else {
    			if( currentOnes > maxOnes ) {
    				maxOnes = currentOnes;
    			}
    			currentOnes = 0;
    		}
    	}

    	if( currentOnes > maxOnes ) {
			maxOnes = currentOnes;
		}
        
    	return maxOnes;
    }
}
