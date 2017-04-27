package roosevelt.michigan.com.easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Design and implement a TwoSum class. It should support the following
 * operations: add and find.
 * 
 * add - Add the number to an internal data structure. find - Find if there
 * exists any pair of numbers which sum is equal to the value.
 * 
 * For example,
 * 
 * add(1); add(3); add(5); find(4) -> true find(7) -> false
 * 
 * @author soup
 *
 */
public class TwoSum {

	private Map<Integer, Boolean> numbers;

	public TwoSum() {
		numbers = new HashMap<>();
	}

	public void add(int number) {
		if( numbers.containsKey(number) ) {
			numbers.put(number, true);
		} else {
			numbers.put(number, false);
		}
	}

	/**
	 * Find if there exists any pair of numbers which sum is equal to the value.
	 */
	public boolean find(int value) {
		Iterator<Integer> itr = numbers.keySet().iterator();

		while (itr.hasNext()) {
			int current = itr.next();
			int need = value - current;
			boolean isSame = need == current;

			if( isSame && numbers.containsKey(need) && numbers.get(need) ) {
				return true;
			} else if( numbers.containsKey(need) && !isSame ) {
				return true;
			}
		}

		return false;
	}

}
