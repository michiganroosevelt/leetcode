package roosevelt.michigan.com.easy;

/**
 * 
 * @author soup
 *
 */
public class AddStrings {

	public String addStrings(String num1, String num2) {
		boolean carry = false;
		StringBuilder sb = new StringBuilder();
		
		int highest = num1.length() < num2.length() ? num2.length() : num1.length();

		for (int i = highest - 1; i >= 0; i--) {
			int a = Integer.parseInt(Character.toString(num1.charAt(i)));
			int b = Integer.parseInt(Character.toString(num2.charAt(i)));
			int add = a + b;
			if (carry) {
				add++;
			}
			if (add < 10) {
				sb.append(add);
				carry = false;
			} else {
				sb.append(add % 10);
				carry = true;
			}
		}
		
		
		
		if( carry ) {
			sb.append("1");
		}

		return sb.reverse().toString();
	}

}
