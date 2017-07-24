package roosevelt.michigan.com.easy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import roosevelt.michigan.com.util.ListNodeUtil;

public class LinkedListCycleTest {

	private LinkedListCycle solution;

	@Before
	public void setup() {
		solution = new LinkedListCycle();
	}

	@Test
	public void testLinkedListCycle() {
		boolean result = solution.hasCycle(ListNodeUtil.build(new Integer[] { 1, 2, 3, 4 }));

		Assert.assertEquals(false, result);
	}

	@Test
	public void testLinkedListCycleNoCycle() {
		boolean result = solution.hasCycle(ListNodeUtil.build(new Integer[] { -21, 10, 17, 8, 4, 26, 5, 35, 33, -7, -16,
				27, -12, 6, 29, -12, 5, 9, 20, 14, 14, 2, 13, -24, 21, 23, -21, 5 }));

		Assert.assertEquals(false, result);
	}

	@Test
	public void testLinkedListCycleWithCycle() {
		boolean result = solution.hasCycle(ListNodeUtil.build(new Integer[] { 1, 2, 1, 2, 4 }));

		Assert.assertEquals(true, result);
	}
}
