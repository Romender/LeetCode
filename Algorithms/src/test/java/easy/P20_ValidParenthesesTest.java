package easy;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class P20_ValidParenthesesTest {

    private P20_ValidParentheses classUnderTest = new P20_ValidParentheses();

    @Test
    public void baseTestCase1() {
        Assertions.assertThat(classUnderTest.isValid("{}")).isTrue();
        Assertions.assertThat(classUnderTest.isValid("{]")).isFalse();
        Assertions.assertThat(classUnderTest.isValid("{)]")).isFalse();
        Assertions.assertThat(classUnderTest.isValid("{()}")).isTrue();
        Assertions.assertThat(classUnderTest.isValid("{([])}")).isTrue();
        Assertions.assertThat(classUnderTest.isValid("{([(]))}")).isFalse();
        Assertions.assertThat(classUnderTest.isValid("{{")).isFalse();
        Assertions.assertThat(classUnderTest.isValid("{}()[]()")).isTrue();
        Assertions.assertThat(classUnderTest.isValid("")).isTrue();

    }


}