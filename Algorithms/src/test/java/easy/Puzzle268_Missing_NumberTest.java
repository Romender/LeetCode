package easy;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.junit.Assert.*;

public class Puzzle268_Missing_NumberTest {

    private  Puzzle268_Missing_Number puzzle = new Puzzle268_Missing_Number();

    @Test
    public void baseTestCase1() {
        int array[] = {3,0,1};
        int missingNumber = puzzle.missingNumber(array);
        Assertions.assertThat(missingNumber).isEqualTo(2);
    }

    @Test
    public void baseTestCase2() {
        int array[] = {9,6,4,2,3,5,7,0,1} ;
        int missingNumber = puzzle.missingNumber(array);
        Assertions.assertThat(missingNumber).isEqualTo(8);
    }
}