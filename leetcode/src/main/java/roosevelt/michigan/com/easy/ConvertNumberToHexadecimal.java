package roosevelt.michigan.com.easy;

/**
 * 
 * @author soup
 *
 */
public class ConvertNumberToHexadecimal {

	public String toHex(int num) {
		if( num == 0 ) {
			return "0";
		}
		
		int mask = 0x0000000f;
		StringBuilder sb = new StringBuilder();
		while (num != 0) {
			int next4 = num & mask;
			num = num >>> 4;

			switch (next4) {
			case 10:
				sb.append("a");
				break;
			case 11:
				sb.append("b");
				break;
			case 12:
				sb.append("c");
				break;
			case 13:
				sb.append("d");
				break;
			case 14:
				sb.append("e");
				break;
			case 15:
				sb.append("f");
				break;
			default:
				sb.append(Integer.toString(next4));
			}
		}

		return sb.reverse().toString();
	}

}
