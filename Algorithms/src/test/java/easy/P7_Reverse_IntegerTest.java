package easy;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class P7_Reverse_IntegerTest {

    private P7_Reverse_Integer obj = new P7_Reverse_Integer();

    @Test
    public void baseCase() {
        int input = 100;
        Assertions.assertThat(obj.reverse(input)).isEqualTo(1);
    }

    @Test
    public void baseCase1() {
        int input = -100;
        Assertions.assertThat(obj.reverse(input)).isEqualTo(-1);
    }

    @Test
    public void baseCase2() {
        int input =Integer.MAX_VALUE;
        Assertions.assertThat(obj.reverse(input)).isEqualTo(0);
    }

    @Test
    public void baseCase3() {
        int input =1534236469;
        Assertions.assertThat(obj.reverse(input)).isEqualTo(0);
    }

}