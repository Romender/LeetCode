package easy;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.junit.Assert.*;

public class Puzzle136_Single_NumberTest {

    private Puzzle136_Single_Number puzzle  = new Puzzle136_Single_Number();

    @Test
    public void baseTestCase1() {
        int array[] = {2,2,1};
        int num = puzzle.singleNumber(array);
        Assertions.assertThat(num).isEqualTo(1);
    }

    @Test
    public void baseTestCase2() {
        int array[] = {4,1,2,1,2};
        int num = puzzle.singleNumber(array);
        Assertions.assertThat(num).isEqualTo(4);
    }

}