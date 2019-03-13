package easy;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class P509_FibonacciNumberTest {

    private P509_FibonacciNumber puzzle  = new P509_FibonacciNumber();

    @Test
    public void baseTestCase1() {
        int result = puzzle.fib(1);
        Assertions.assertThat(result).isEqualTo(1);
    }

    @Test
    public void baseTestCase2() {
        int result = puzzle.fib(2);
        Assertions.assertThat(result).isEqualTo(1);
    }

    @Test
    public void baseTestCase3() {
        int result = puzzle.fib(4);
        Assertions.assertThat(result).isEqualTo(3);
    }

}