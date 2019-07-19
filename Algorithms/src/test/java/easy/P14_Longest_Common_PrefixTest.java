package easy;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class P14_Longest_Common_PrefixTest {

    private P14_Longest_Common_Prefix clazz = new P14_Longest_Common_Prefix();

    @Test
    public void baseTestCase1() {
        String input[] ={"flower","flow","flight"};
        Assertions.assertThat(clazz.longestCommonPrefix(input)).isEqualTo("fl");
    }

    @Test
    public void baseTestCase2() {
        String input[] ={"dog","flow","flight"};
        Assertions.assertThat(clazz.longestCommonPrefix(input)).isEqualTo("");
    }
    @Test
    public void baseTestCase3() {
        String input[] ={"a"};
        Assertions.assertThat(clazz.longestCommonPrefix(input)).isEqualTo("a");
    }

    @Test
    public void baseTestCase4() {
        String input[] ={"aa","aa"};
        Assertions.assertThat(clazz.longestCommonPrefix(input)).isEqualTo("aa");
    }
}