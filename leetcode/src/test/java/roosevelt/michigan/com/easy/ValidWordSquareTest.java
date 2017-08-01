
package roosevelt.michigan.com.easy;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ValidWordSquareTest {

    private ValidWordSquare solution;

    @Before
    public void setup() {
        solution = new ValidWordSquare();
    }

    @Test
    public void testValidWordSquareValid() {
    	List<String> input = new ArrayList<>();
    	input.add("abcd");
    	input.add("bnrt");
    	input.add("crmy");
    	input.add("dtye");
    	
        boolean result = solution.validWordSquare(input);

        Assert.assertEquals(true, result);
    }

    @Test
    public void testValidWordSquareInvalid() {
    	List<String> input = new ArrayList<>();
    	input.add("abcd");
    	input.add("bnrt");
    	input.add("crmy");
    	input.add("dtwe");
    	
        boolean result = solution.validWordSquare(input);

        Assert.assertEquals(false, result);
    }

    @Test
    public void testValidWordSquareValidOffset() {
    	List<String> input = new ArrayList<>();
    	input.add("abcd");
    	input.add("bnrt");
    	input.add("crm");
    	input.add("dt");
    	
        boolean result = solution.validWordSquare(input);

        Assert.assertEquals(true, result);
    }

    
    @Test
    public void testValidWordSquareInvalidInput() {
    	List<String> input = new ArrayList<>();
    	input.add("abcd");
    	input.add("b");
    	input.add("crm");
    	input.add("d");
    	
        boolean result = solution.validWordSquare(input);

        Assert.assertEquals(false, result);
    }
}
