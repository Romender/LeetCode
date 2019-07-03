package easy;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class P121_Best_time_to_buy_and_sell_stockTest {

    private P121_Best_time_to_buy_and_sell_stock object = new P121_Best_time_to_buy_and_sell_stock();

    @Test
    public void baseTestCase1() {
        int input[] = {7,1,5,3,6,4};
        Assertions.assertThat(object.maxProfit(input)).isEqualTo(5);
    }

    @Test
    public void baseTestCase2() {
        int input[] = {7,6,4,3,1};
        Assertions.assertThat(object.maxProfit(input)).isEqualTo(0);
    }


    @Test
    public void baseTestCase3() {
        int input[] = {7,3,5,1,6,4};
        Assertions.assertThat(object.maxProfit(input)).isEqualTo(5);
    }
}