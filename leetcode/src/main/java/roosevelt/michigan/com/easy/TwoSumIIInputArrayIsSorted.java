package roosevelt.michigan.com.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers that is already sorted in ascending order, find
 * two numbers such that they add up to a specific target number.
 * 
 * The function twoSum should return indices of the two numbers such that they
 * add up to the target, where index1 must be less than index2. Please note that
 * your returned answers (both index1 and index2) are not zero-based.
 * 
 * You may assume that each input would have exactly one solution and you may
 * not use the same element twice.
 * 
 * Input: numbers={2, 7, 11, 15}, target=9 Output: index1=1, index2=2
 * 
 * @author soup
 *
 */
public class TwoSumIIInputArrayIsSorted {

    public int[] twoSum(int[] numbers, int target) {
    	Map<Integer, Integer> numberMap = new HashMap<>();
    	
        for( int i = 0; i < numbers.length; i++ ) {
        	int need = target - numbers[i];
        	if( numberMap.containsKey(need) ) {
        		return new int[]{numberMap.get(need)+1, i+1};
        	} else {
        		numberMap.put(numbers[i], i);
        	}
        }
    	
    	return null;
    }
}
