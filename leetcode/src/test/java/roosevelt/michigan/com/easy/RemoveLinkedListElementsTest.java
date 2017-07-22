package roosevelt.michigan.com.easy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import roosevelt.michigan.com.common.ListNode;

public class RemoveLinkedListElementsTest {

	private RemoveLinkedListElements solution;

	@Before
	public void setup() {
		solution = new RemoveLinkedListElements();
	}

	@Test
	public void testRemoveLinkedListElementsRemoveEnd() {
		ListNode input = new ListNode(1);
		input.next = new ListNode(2);
		input.next.next = new ListNode(3);
		
		ListNode result = solution.removeElements(input, 3);
		Assert.assertEquals(result.val, 1);
		Assert.assertEquals(result.next.val, 2);
		Assert.assertEquals(result.next.next, null);
	}

	@Test
	public void testRemoveLinkedListElementsRemoveMiddle() {
		ListNode input = new ListNode(1);
		input.next = new ListNode(2);
		input.next.next = new ListNode(3);
		
		ListNode result = solution.removeElements(input, 2);
		Assert.assertEquals(result.val, 1);
		Assert.assertEquals(result.next.val, 3);
		Assert.assertEquals(result.next.next, null);
	}

	@Test
	public void testRemoveLinkedListElementsRemoveTwoInARow() {
		ListNode input = new ListNode(1);
		input.next = new ListNode(2);
		input.next.next = new ListNode(2);
		input.next.next.next = new ListNode(3);
		
		ListNode result = solution.removeElements(input, 2);
		Assert.assertEquals(result.val, 1);
		Assert.assertEquals(result.next.val, 3);
		Assert.assertEquals(result.next.next, null);
	}

	@Test
	public void testRemoveLinkedListElementsRemoveBeginning() {
		ListNode input = new ListNode(1);
		input.next = new ListNode(2);
		input.next.next = new ListNode(3);
		
		ListNode result = solution.removeElements(input, 1);
		Assert.assertEquals(result.val, 2);
		Assert.assertEquals(result.next.val, 3);
		Assert.assertEquals(result.next.next, null);
	}
}
