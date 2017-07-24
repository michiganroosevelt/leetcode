package roosevelt.michigan.com.easy;

import org.junit.Before;
import org.junit.Test;

import roosevelt.michigan.com.common.ListNode;
import roosevelt.michigan.com.util.ListNodeUtil;

public class DeleteNodeInALinkedListTest {
	
	private DeleteNodeInALinkedList solution;

	@Before
	public void setup() {
		solution = new DeleteNodeInALinkedList();
	}

	@Test
	public void testDeleteNodeInALinkedListExample() {
		ListNode root = ListNodeUtil.build(new Integer[]{1,2,3,4});
		solution.deleteNode(root.get(2));
		
		ListNode expected = ListNodeUtil.build(new Integer[]{1,2,4});
		ListNodeUtil.assertEquals(expected, root);
	}

	@Test
	public void testDeleteNodeInALinkedListFirstNode() {
		ListNode root = ListNodeUtil.build(new Integer[]{1,2,3,4});
		solution.deleteNode(root);

		ListNode expected = ListNodeUtil.build(new Integer[]{2,3,4});
		ListNodeUtil.assertEquals(expected, root);
	}


}
