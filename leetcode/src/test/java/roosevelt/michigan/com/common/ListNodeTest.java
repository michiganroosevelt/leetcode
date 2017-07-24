package roosevelt.michigan.com.common;

import org.junit.Assert;
import org.junit.Test;

import roosevelt.michigan.com.util.ListNodeUtil;

public class ListNodeTest {

	@Test
	public void testRemoveLastNode() {
		ListNode head = ListNodeUtil.build(new Integer[] { 1, 2, 3, 4 });
		ListNode result = ListNodeUtil.removeNode(head, 3);
		ListNode compare = ListNodeUtil.build(new Integer[] { 1, 2, 3 });

		ListNodeUtil.assertEquals(compare, result);
	}

	@Test
	public void testRemoveFirstNode() {
		ListNode head = ListNodeUtil.build(new Integer[] { 1, 2, 3, 4 });
		ListNode result = ListNodeUtil.removeNode(head, 0);
		ListNode compare = ListNodeUtil.build(new Integer[] { 2, 3, 4 });

		ListNodeUtil.assertEquals(compare, result);
	}

	@Test
	public void testRemoveMiddleNode() {
		ListNode head = ListNodeUtil.build(new Integer[] { 1, 2, 3, 4 });
		ListNode result = ListNodeUtil.removeNode(head, 2);
		ListNode compare = ListNodeUtil.build(new Integer[] { 1, 2, 4 });

		ListNodeUtil.assertEquals(compare, result);
	}

	@Test
	public void testAddNodeZero() {
		ListNode head = ListNodeUtil.build(new Integer[] { 1, 2, 3, 4 });
		ListNode result = ListNodeUtil.addNode(head, 10, 0);
		ListNode compare = ListNodeUtil.build(new Integer[] { 10, 1, 2, 3, 4 });

		ListNodeUtil.assertEquals(compare, result);
	}

	@Test
	public void testAddNodeEnd() {
		ListNode head = ListNodeUtil.build(new Integer[] { 1, 2, 3, 4 });

		ListNode result = ListNodeUtil.addNode(head, 5, 4);

		ListNode compare = ListNodeUtil.build(new Integer[] { 1, 2, 3, 4, 5 });
		ListNodeUtil.assertEquals(compare, result);
	}

	@Test
	public void testAddNodeMiddle() {
		ListNode head = ListNodeUtil.build(new Integer[] { 1, 2, 3, 4 });

		ListNode result = ListNodeUtil.addNode(head, 10, 2);

		ListNode compare = ListNodeUtil.build(new Integer[] { 1, 2, 10, 3, 4 });
		ListNodeUtil.assertEquals(compare, result);
	}

	@Test(expected = IndexOutOfBoundsException.class)
	public void testGetIndexOutOfBounds() {
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(3);
		ListNode node4 = new ListNode(4);

		node1.next = node2;
		node2.next = node3;
		node3.next = node4;

		node1.get(4);
	}

	@Test
	public void testGetLast() {
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(3);
		ListNode node4 = new ListNode(4);

		node1.next = node2;
		node2.next = node3;
		node3.next = node4;

		ListNode result = node1.get(3);
		Assert.assertEquals(node4, result);
	}

	@Test
	public void testGetFirst() {
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(3);
		ListNode node4 = new ListNode(4);

		node1.next = node2;
		node2.next = node3;
		node3.next = node4;

		ListNode result = node1.get(0);
		Assert.assertEquals(node1, result);
	}

	@Test
	public void testGet() {
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(3);
		ListNode node4 = new ListNode(4);

		node1.next = node2;
		node2.next = node3;
		node3.next = node4;

		ListNode result = node1.get(2);
		Assert.assertEquals(node3, result);
	}

	@Test
	public void testToStringSix() {
		ListNode input = ListNodeUtil.build(new Integer[] { 1, 2, 3, 4, 5, 6 });
		String result = input.toString();

		Assert.assertEquals("1 - 2 - 3 - 4 - 5 - 6", result);
	}

	@Test
	public void testToStringFour() {
		ListNode input = ListNodeUtil.build(new Integer[] { 1, 3, 3, 7 });
		String result = input.toString();

		Assert.assertEquals("1 - 3 - 3 - 7", result);
	}

	@Test
	public void testToStringSingle() {
		ListNode input = ListNodeUtil.build(new Integer[] { 1 });
		String result = input.toString();

		Assert.assertEquals("1", result);
	}

}
