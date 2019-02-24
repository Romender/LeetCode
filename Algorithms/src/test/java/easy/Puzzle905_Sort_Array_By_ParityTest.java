package easy;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class Puzzle905_Sort_Array_By_ParityTest {

    private Puzzle905_Sort_Array_By_Parity puzzle = new Puzzle905_Sort_Array_By_Parity();

    @Test
    public void baseCaseTest1() {
        int array[] = {3,1,2,4};
        int result[] = puzzle.sortArrayByParity(array);
        Arrays.stream(result).forEach(System.out::print);
    }

    @Test
    public void baseCaseTest2() {
        int array[] = {1,3};
        int result[] = puzzle.sortArrayByParity(array);
        Arrays.stream(result).forEach(System.out::print);
    }

}