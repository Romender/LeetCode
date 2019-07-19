package easy;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class P9_PalindromeNumberTest {

    private P9_PalindromeNumber classUnderTest = new P9_PalindromeNumber();

    @Test
    public void baseTestCase1() {
        long beforeUsedMem=Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();
        Assertions.assertThat(classUnderTest.isPalindrome(100)).isFalse();
        Assertions.assertThat(classUnderTest.isPalindrome(-121)).isFalse();
        Assertions.assertThat(classUnderTest.isPalindrome(121)).isTrue();
        long afterUsedMem=Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();
        long actualMemUsed=afterUsedMem-beforeUsedMem;
        System.out.println(actualMemUsed/1024);

    }
}