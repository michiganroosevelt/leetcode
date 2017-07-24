package roosevelt.michigan.com.common;

public class ListNode {
	public int val;

	public ListNode next;

	public ListNode(int x) {
		val = x;
	}

	public ListNode get(int index) {
		if (index == 0) {
			return this;
		}

		ListNode itr = this;
		for (int i = 0; i < index; i++) {
			itr = itr.next;
			if (itr == null) {
				throw new IndexOutOfBoundsException();
			}
		}

		return itr;
	}

	public String toString() {
		ListNode node = this;
		StringBuffer sb = new StringBuffer();
		String delimiter = "";

		while (node != null) {
			sb.append(delimiter + node.val);
			delimiter = " - ";
			node = node.next;
		}
		return sb.toString();
	}
}