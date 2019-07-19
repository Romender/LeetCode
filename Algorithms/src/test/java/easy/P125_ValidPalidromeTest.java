package easy;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class P125_ValidPalidromeTest {

    private P125_ValidPalidrome clazz = new P125_ValidPalidrome();

    @Test
    public void baseTestCase() {
        Assertions.assertThat(clazz.isPalindrome("A man, a plan, a canal: Panama")).isTrue();
        Assertions.assertThat(clazz.isPalindrome("race a car")).isFalse();
        Assertions.assertThat(clazz.isPalindrome("race a car1")).isFalse();
    }

}