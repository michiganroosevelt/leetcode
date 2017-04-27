package roosevelt.michigan.com.easy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import roosevelt.michigan.com.common.ListNode;

public class RemoveDuplicatesFromSortedListTest {

	private RemoveDuplicatesFromSortedList solution;

	@Before
	public void setup() {
		solution = new RemoveDuplicatesFromSortedList();
	}

	@Test
	public void testRemoveDuplicatesFromSortedListDuplicatesAtBeginning() {
		ListNode head = new ListNode(1);
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(2);

		head.next = node1;
		node1.next = node2;

		ListNode result = solution.deleteDuplicates(head);

		Assert.assertEquals(1, result.val);
		Assert.assertEquals(2, result.next.val);
		Assert.assertEquals(null, result.next.next);
	}

	@Test
	public void testRemoveDuplicatesFromSortedListAllDuplicates() {
		ListNode head = new ListNode(1);
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(1);

		head.next = node1;
		node1.next = node2;

		ListNode result = solution.deleteDuplicates(head);

		Assert.assertEquals(1, result.val);
		Assert.assertEquals(null, result.next);
	}

	@Test
	public void testRemoveDuplicatesFromSortedListDuplicatesAtEnd() {
		ListNode head = new ListNode(1);
		ListNode node1 = new ListNode(2);
		ListNode node2 = new ListNode(2);

		head.next = node1;
		node1.next = node2;

		ListNode result = solution.deleteDuplicates(head);

		Assert.assertEquals(1, result.val);
		Assert.assertEquals(2, result.next.val);
		Assert.assertEquals(null, result.next.next);
	}

	@Test
	public void testRemoveDuplicatesFromSortedListDuplicatesAtMiddle() {
		ListNode head = new ListNode(1);
		ListNode node1 = new ListNode(2);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(3);

		head.next = node1;
		node1.next = node2;
		node2.next = node3;

		ListNode result = solution.deleteDuplicates(head);

		Assert.assertEquals(1, result.val);
		Assert.assertEquals(2, result.next.val);
		Assert.assertEquals(3, result.next.next.val);
		Assert.assertEquals(null, result.next.next.next);
	}
}
