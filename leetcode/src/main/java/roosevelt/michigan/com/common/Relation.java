package roosevelt.michigan.com.common;

import java.util.HashMap;
import java.util.Map;

public class Relation {

	public Map<Integer, int[]> relationshipMap = new HashMap<>();

	public boolean knows(int a, int b) {

		if (!relationshipMap.containsKey(a)) {
			return false;
		}

		int[] known = relationshipMap.get(a);
		for (int i = 0; i < known.length; i++) {
			if (b == known[i]) {
				return true;
			}
		}

		return false;
	}

}
