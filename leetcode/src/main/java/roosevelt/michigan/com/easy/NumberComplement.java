package roosevelt.michigan.com.easy;

public class NumberComplement {

	public int findComplement(int num) {
		int ones = (Integer.highestOneBit(num) << 1) - 1;
		return num ^ ones;
	}

}
