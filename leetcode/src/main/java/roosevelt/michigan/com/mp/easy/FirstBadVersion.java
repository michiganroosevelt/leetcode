package roosevelt.michigan.com.mp.easy;

import java.util.HashMap;
import java.util.Map;

import roosevelt.michigan.com.common.VersionControl;

/**
 * 
 * @author soup
 *
 */
public class FirstBadVersion extends VersionControl {

	Map<Integer, Integer> cache = new HashMap<>();

	public int firstBadVersion(int n) {
		int start = 1, end = n;
		while (start < end) {
			int mid = start + (end - start) / 2;
			if (!isBadVersion(mid))
				start = mid + 1;
			else
				end = mid;
		}
		return start;
	}

}
