package easy;

import org.junit.Assert;
import org.junit.Test;

public class Puzzle643_Maximum_Average_Subarray_ITest {

    private Puzzle643_Maximum_Average_Subarray_I puzzle = new Puzzle643_Maximum_Average_Subarray_I();

    @Test
    public void baseTestCase1() {
        int array[] = {1,12,-5,-6,50,3};
        int k = 4;
        double result = puzzle.findMaxAverage(array,k);
        Assert.assertEquals(12.75d, result,0);
    }

    @Test
    public void baseTestCase2() {
        int array[] = { -1};
        int k = 1;
        double result = puzzle.findMaxAverage(array,k);
        Assert.assertEquals(-1.0d, result,0);

    }

    @Test
    public void baseTestCase3() {
        int array[] ={7,4,5,8,8,3,9,8,7,6};
        int k = 7;
        double result = puzzle.findMaxAverage(array,k);
        Assert.assertEquals(7.0d,result,0.0d);
    }
}