package easy;


import org.assertj.core.api.Assertions;
import org.junit.Test;

public class P70_climbing_stairsTest {

    private P70_climbing_stairs object = new P70_climbing_stairs();

    @Test
    public void baseTestCase1() {
        Assertions.assertThat(object.climbStairs(1)).isEqualTo(1);
    }

    @Test
    public void baseTestCase2() {
        Assertions.assertThat(object.climbStairs(3)).isEqualTo(3);
    }

    @Test
    public void baseTestCase3() {
        Assertions.assertThat(object.climbStairs(4)).isEqualTo(5);
    }

    @Test
    public void baseTestCase4() {
        Assertions.assertThat(object.climbStairs(5)).isEqualTo(8);
    }
}