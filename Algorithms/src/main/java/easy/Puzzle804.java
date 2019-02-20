package easy;

import java.util.HashSet;
import java.util.Set;

/**
 * nternational Morse Code defines a standard encoding where each letter is mapped to a series of dots and dashes, as follows: "a" maps to ".-", "b" maps to "-...", "c" maps to "-.-.", and so on.
 *
 * For convenience, the full table for the 26 letters of the English alphabet is given below:
 *
 * [".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."]
 * Now, given a list of words, each word can be written as a concatenation of the Morse code of each letter. For example, "cba" can be written as "-.-..--...", (which is the concatenation "-.-." + "-..." + ".-"). We'll call such a concatenation, the transformation of a word.
 *
 * Return the number of different transformations among all words we have.
 *
 * Example:
 * Input: words = ["gin", "zen", "gig", "msg"]
 * Output: 2
 * Explanation:
 * The transformation of each word is:
 * "gin" -> "--...-."
 * "zen" -> "--...-."
 * "gig" -> "--...--."
 * "msg" -> "--...--."
 *
 * There are 2 different transformations, "--...-." and "--...--.".
 * Note:
 *
 * The length of words will be at most 100.
 * Each words[i] will have length in range [1, 12].
 * words[i] will only consist of lowercase letters.
 *
 */
public class Puzzle804 {

    /**
     *
     * Storing the morse code in array, identify the character ascii location minus 97. 97 is starting character of 'a'.
     *
     * @param words arrays of words
     * @return number of distinct morseCode
     *
     * Runtime: 5 ms, faster than 90.23% of Java online submissions for Unique Morse Code Words.
     * Memory Usage: 37.2 MB, less than 100.00% of Java online submissions for Unique Morse Code Words.
     *
     */
    public int uniqueMorseRepresentations(String[] words) {
        String morseCode[] = {".-","-...","-.-.","-..",".","..-.","--.","....", "Algorithms",".---","-.-",".-..","--","-.",
                "---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        Set<String> morseCodeSet = new HashSet<>();
        for(String word : words) {
            StringBuffer sb = new StringBuffer();
            for(Character c : word.toCharArray()) {
                sb.append(morseCode[((int)c -97)]);
            }
            morseCodeSet.add(sb.toString());
        }
        return morseCodeSet.size();
    }

}
