package roosevelt.michigan.com.easy;

/**
 * 
 * Related to question Excel Sheet Column Title
 * 
 * Given a column title as appear in an Excel sheet, return its corresponding
 * column number.
 * 
 * For example:
 * 
 * A -> 1 B -> 2 C -> 3 ... Z -> 26 AA -> 27 AB -> 28
 * 
 * @author soup
 *
 */
public class ExcelSheetColumnNumber {

	public int titleToNumber(String s) {
		int sum = 0;

		int power = s.length()-1;
		for( int i = 0; i < s.length(); i++ ) {
			int base = (int)s.charAt(i) - 'A' + 1;
			int carry = (int)Math.pow(26, power);
			power--;
			sum += (base * carry);
			
		}

		return sum;
	}
}
