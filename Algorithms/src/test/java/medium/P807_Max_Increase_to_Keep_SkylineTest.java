package medium;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class P807_Max_Increase_to_Keep_SkylineTest {

    private P807_Max_Increase_to_Keep_Skyline object = new P807_Max_Increase_to_Keep_Skyline();

    @Test
    public void baseCase() {
        int[][] input ={{3, 0, 8, 4},{2, 4, 5, 7},{9, 2, 6, 3},{0, 3, 1, 0} };
        Assertions.assertThat(object.maxIncreaseKeepingSkyline(input)).isEqualTo(35);
    }
}