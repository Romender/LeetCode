package easy;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class P821_Shortest_Distance_to_characterTest {

    private P821_Shortest_Distance_to_character object = new P821_Shortest_Distance_to_character();

    @Test
    public void baseCase1() {
        String input = "loveleetcode";
        char c = 'e';
        Assertions.assertThat(object.shortestToChar(input,c)).containsSequence(3, 2, 1, 0, 1, 0, 0, 1, 2, 2, 1, 0);
    }

    @Test
    public void baseCase2() {
        String input ="mandatory";
        char c = 'a';
        Assertions.assertThat(object.shortestToChar(input,c)).containsSequence(1,0,1,1,0,1,2,3,4);
    }
}