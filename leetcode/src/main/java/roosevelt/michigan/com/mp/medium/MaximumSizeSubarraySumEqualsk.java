package roosevelt.michigan.com.mp.medium;

/**
 * 
 * @author soup
 *
 */
public class MaximumSizeSubarraySumEqualsk {
	
	
    public int maxSubArrayLen(int[] nums, int k) {
    	int length = 0;
    	
    	for( int i = 0; i < nums.length; i++ ){
    		int currentMaxLength = findMaxArray(nums,i,k);
    		if( currentMaxLength > length ) {
    			length = currentMaxLength;
    		}
    	}
    	
        return length;
    }
    
    private int findMaxArray(int[] nums, int start, int target) {
    	int length = 0;
    	int sum = 0;
    	int count = 0;
    	
    	for( int i = start; i < nums.length; i++ ) {
    		sum += nums[i];
    		if( sum == target) {
    			length = count+1;
    		}
    		count++;
    	}
    	
    	return length;
    }
	
}
