package roosevelt.michigan.com.util;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import roosevelt.michigan.com.common.ListNode;

public class ListNodeUtilTest {

	private ListNode input1 = null;

	private ListNode input2 = null;

	@Before
	public void setup() {
		input1 = new ListNode(1);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(3);
		ListNode node4 = new ListNode(4);
		ListNode node5 = new ListNode(5);
		input1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;

		input2 = new ListNode(1);
		ListNode node2_2 = new ListNode(2);
		ListNode node2_3 = new ListNode(3);
		ListNode node2_4 = new ListNode(4);
		ListNode node2_5 = new ListNode(5);
		input2.next = node2_2;
		node2_2.next = node2_3;
		node2_3.next = node2_4;
		node2_4.next = node2_5;
	}

	@Test(expected = AssertionError.class)
	public void testAssertEqualsFail() {
		input1.next.next = null;
		ListNodeUtil.assertEquals(input1, input2);
	}

	@Test(expected = AssertionError.class)
	public void testAssertEqualsFailValueDifferent() {
		input1.next.next.val = 10;
		ListNodeUtil.assertEquals(input1, input2);
	}

	@Test
	public void testAssertEqualsSuccess() {
		ListNodeUtil.assertEquals(input1, input2);
	}

	@Test
	public void testBuild() {
		Integer[] input = new Integer[] { 1, 2, 3, 4, 5 };

		ListNode result = ListNodeUtil.build(input);
		ListNodeUtil.assertEquals(input1, result);
	}

	@Test
	public void testToString() {
		String result = ListNodeUtil.toString(input1);
		Assert.assertEquals("1 2 3 4 5", result);
	}

}
