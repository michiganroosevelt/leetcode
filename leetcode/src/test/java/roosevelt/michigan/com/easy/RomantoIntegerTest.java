
package roosevelt.michigan.com.easy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RomantoIntegerTest {

    private RomantoInteger solution;

    @Before
    public void setup() {
        solution = new RomantoInteger();
    }

    @Test
    public void testAddDigitsExample() {
        int result = solution.romanToInt(33);

        Assert.assertEquals(null, result);
    }
}
