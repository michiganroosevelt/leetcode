package roosevelt.michigan.com.easy;

/**
 * 
 * @author soup
 *
 */
public class ReverseBits {

    public int reverseBits(int n) {
    	int result = 0;
    	for( int i = 0; i < 32; i++ ) {
    		System.out.println(Integer.toBinaryString(n));
    		int tmp = n & 1;
    		n = n >>> 1;
    		result = result << 1;
    		result = result | tmp;
    	}
        
    	return result;
    }
	
}
