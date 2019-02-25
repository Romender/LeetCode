package medium;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.junit.Assert.*;

public class Puzzle287_Find_the_Duplicate_NumberTest {

    private Puzzle287_Find_the_Duplicate_Number puzzle = new Puzzle287_Find_the_Duplicate_Number();

    @Test
    public void baseTestCase1() {
        int nums[] = {1,3,4,2,2};
        int duplicateNumber = puzzle.findDuplicate(nums);
        Assertions.assertThat(duplicateNumber).isEqualTo(2);
    }

    @Test
    public void baseTestCase2() {
        int nums[] = {3,1,3,4,2};
        int duplicateNumber = puzzle.findDuplicate(nums);
        Assertions.assertThat(duplicateNumber).isEqualTo(3);
    }

}