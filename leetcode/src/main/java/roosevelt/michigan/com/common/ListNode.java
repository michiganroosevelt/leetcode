package roosevelt.michigan.com.common;

public class ListNode {
	public int val;

	public ListNode next;

	public ListNode(int x) {
		val = x;
	}
	
	public String toString() {
		ListNode node = this;
		StringBuffer sb = new StringBuffer();
		String delimiter = "";
		
		while( node != null ) {
			sb.append( delimiter + node.val );
			delimiter = " - ";
			node = node.next;
		}
		return sb.toString();
	}
}