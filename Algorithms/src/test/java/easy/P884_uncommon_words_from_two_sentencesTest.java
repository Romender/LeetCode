package easy;

import org.junit.Test;

import java.util.Arrays;

public class P884_uncommon_words_from_two_sentencesTest {

    private P884_uncommon_words_from_two_sentences object = new P884_uncommon_words_from_two_sentences();

    @Test
    public void baseCase1() {
        String a = "this apple is sweet";
        String b = "this apple is sour";
        String output[] = object.uncommonFromSentences(a,b);
        System.out.println(Arrays.toString(output));
    }

    @Test
    public void baseCase2() {
        String a = "apple apple";
        String b = "banana";
        String output[] = object.uncommonFromSentences(a,b);
        System.out.println(Arrays.toString(output));
    }
}