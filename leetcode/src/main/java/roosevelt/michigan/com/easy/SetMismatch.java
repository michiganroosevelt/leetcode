package roosevelt.michigan.com.easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 
 * @author soup
 *
 */
public class SetMismatch {

	public int[] findErrorNums(int[] nums) {
		Arrays.sort(nums);
		Set<Integer> shouldHave = new HashSet<>();
		Set<Integer> found = new HashSet<>();
		int[] result = new int[2];
		
		for( int i = 1; i < nums.length+1; i++ ) {
			shouldHave.add(i);
		}
		
		for( int value : nums ) {
			shouldHave.remove(value);
			if( found.contains(value)) {
				result[0] = value;
			} else {
				found.add(value);
			}
		}
		
		result[1] = shouldHave.toArray(new Integer[1])[0];
		
		return result;
	}

}
