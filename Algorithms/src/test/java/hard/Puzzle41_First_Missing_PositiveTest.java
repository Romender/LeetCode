package hard;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class Puzzle41_First_Missing_PositiveTest {

    private Puzzle41_First_Missing_Positive puzzle = new Puzzle41_First_Missing_Positive();

    @Test
    public void baseTestCase1() {
        int nums[] = {1,2,0};
        int missingNumber = puzzle.firstMissingPositive(nums);
        Assertions.assertThat(missingNumber).isEqualTo(3);
    }

    @Test
    public void baseTestCase2() {
        int nums[] = {3,4,-1,1};
        int missingNumber = puzzle.firstMissingPositive(nums);
        Assertions.assertThat(missingNumber).isEqualTo(2);
    }

    @Test
    public void baseTestCase3 () {
        int nums[] = {7,8,9,11,12};
        int missingNumber = puzzle.firstMissingPositive(nums);
        Assertions.assertThat(missingNumber).isEqualTo(1);
    }

    @Test
    public void baseTestCase4 () {
        int nums[] = {};
        int missingNumber = puzzle.firstMissingPositive(nums);
        Assertions.assertThat(missingNumber).isEqualTo(1);
    }

    @Test
    public void baseTestCase5 () {
        int nums[] = {2147483647};
        int missingNumber = puzzle.firstMissingPositive(nums);
        Assertions.assertThat(missingNumber).isEqualTo(1);
    }

    @Test
    public void baseTestCase6 () {
        int nums[] = {1};
        int missingNumber = puzzle.firstMissingPositive(nums);
        Assertions.assertThat(missingNumber).isEqualTo(2);
    }

}