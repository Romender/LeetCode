package easy;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.junit.Assert.*;

public class Puzzle961_N_Repeated_Element_in_Size_2N_ArrayTest {

    private Puzzle961_N_Repeated_Element_in_Size_2N_Array puzzle = new Puzzle961_N_Repeated_Element_in_Size_2N_Array();

    @Test
    public void baseTestcase1() {
        int A[] = {1,2,3,3};
        int result = puzzle.repeatedNTimes(A);
        Assertions.assertThat(result).isEqualTo(3);
    }

    @Test
    public void baseTestCase2() {
        int A[] = {2,1,2,5,3,2};
        int result = puzzle.repeatedNTimes(A);
        Assertions.assertThat(result).isEqualTo(2);
    }

    @Test
    public void baseTestCase3(){
        int A[] = {5,1,5,2,5,3,5,4};
        int result = puzzle.repeatedNTimes(A);
        Assertions.assertThat(result).isEqualTo(5);
    }

}