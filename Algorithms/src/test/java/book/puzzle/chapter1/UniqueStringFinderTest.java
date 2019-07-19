package book.puzzle.chapter1;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class UniqueStringFinderTest {

    private UniqueStringFinder uniqueStringFinder = new UniqueStringFinder();

    @Test
    public void baseTestCase() {
      //  Assertions.assertThat(uniqueStringFinder.isUnique("abcdefg")).isTrue();
        Assertions.assertThat(uniqueStringFinder.isUnique("abcdefga")).isFalse();
        Assertions.assertThat(uniqueStringFinder.isUnique("abcddffdefga")).isFalse();
        Assertions.assertThat(uniqueStringFinder.isUnique("漢字漢字")).isFalse();
    }
}