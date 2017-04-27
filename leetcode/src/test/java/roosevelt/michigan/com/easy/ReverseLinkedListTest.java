package roosevelt.michigan.com.easy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import roosevelt.michigan.com.common.ListNode;

public class ReverseLinkedListTest {
	
	private ReverseLinkedList solution;

	@Before
	public void setup() {
		solution = new ReverseLinkedList();
	}

	@Test
	public void testReverseLinkedList() {
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(3);
		ListNode node4 = new ListNode(4);
		
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		
		ListNode result = solution.reverseList(node1);

		Assert.assertEquals(4, result.val);
		Assert.assertEquals(3, result.next.val);
		Assert.assertEquals(2, result.next.next.val);
		Assert.assertEquals(1, result.next.next.next.val);
	}

	@Test
	public void testReverseLinkedListLengthTwo() {
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(2);
		
		node1.next = node2;
		
		ListNode result = solution.reverseList(node1);

		Assert.assertEquals(2, result.val);
		Assert.assertEquals(1, result.next.val);
	}

	
}
