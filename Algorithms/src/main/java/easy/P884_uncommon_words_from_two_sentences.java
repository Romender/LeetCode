package easy;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class P884_uncommon_words_from_two_sentences {

    public String[] uncommonFromSentences(String a, String b) {
        Set<String> unCommonWords = new HashSet<>();
        Set<String> words = new HashSet<>();
        Stream.of((a+ " "+b).split(" ")).
                forEach(word -> {
                    if (words.contains(word))
                        unCommonWords.remove(word);
                    else {
                        unCommonWords.add(word);
                        words.add(word);
                    }
                } );
        String array [] = new String[unCommonWords.size()];
        return unCommonWords.toArray(array);
    }
}
