package easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * You're given strings J representing the types of stones that are jewels, and S representing the stones you have.
 * Each character in S is a type of stone you have.  You want to know how many of the stones you have are also jewels.
 *
 * The letters in J are guaranteed distinct, and all characters in J and S are letters. Letters are case sensitive,
 * so "a" is considered a different type of stone from "A".
 * Example 1:
 *
 * Input: J = "aA", S = "aAAbbbb"
 * Output: 3
 *
 * Example 2:
 * Input: J = "z", S = "ZZ"
 * Output: 0
 *
 * Note:
 *
 * S and J will consist of letters and have length at most 50.
 * The characters in J are distinct.
 */
public class Puzzle771 {

    /**
     *
     * Solution is iterate over input for each character and check whether that character contains in the
     * String representing the jewels.
     *
     * The solution is O(n*n) complexity
     *
     * @param J Characters represents Jewels
     * @param S Stream of Characters that are either stones or jewels.
     * @return int number of Jewels
     *
     *
     * Runtime: 9 ms, faster than 75.92% of Java online submissions for Jewels and Stones.
     * Memory Usage: 27.1 MB, less than 27.53% of Java online submissions for Jewels and Stones.
     */
    public int numJewelsInStones_One(String J, String S) {
        int jewelCount = 0 ;
        List<Character> jewelList = new ArrayList<>();
        for(int i = 0 ; i < J.length(); i++) {
            jewelList.add(J.charAt(i));
        }
        if(jewelList.isEmpty())
            return 0;
        for( int i = 0; i < S.length(); i++ ) {
            if(jewelList.contains(S.charAt(i)))
                jewelCount++;
        }
        return jewelCount;
    }


    /**
     * Instead of using List, Used Set.
     *
     * @param J Characters represents Jewels
     * @param S Stream of Characters that are either stones or jewels.
     * @return int number of Jewels
     *
     * Runtime: 12 ms, faster than 42.12% of Java online submissions for Jewels and Stones.
     * Memory Usage: 27.3 MB, less than 3.92% of Java online submissions for Jewels and Stones.
     *
     */
    public int numJewelsInStones_Two(String J, String S) {
        int jewelCount = 0 ;
        Set<Character> jewelList = new TreeSet<>();
        for(int i = 0 ; i < J.length(); i++) {
            jewelList.add(J.charAt(i));
        }
        if(jewelList.isEmpty())
            return 0;
        for( int i = 0; i < S.length(); i++ ) {
            if(jewelList.contains(S.charAt(i)))
                jewelCount++;
        }
        return jewelCount;
    }


    /**
     *
     * Instead of using collections, iterate the string's character itself.
     *
     * @param J Characters represents Jewels
     * @param S Stream of Characters that are either stones or jewels.
     * @return int number of Jewels
     *
    Runtime: 9 ms, faster than 75.92% of Java online submissions for Jewels and Stones.
    Memory Usage: 27.1 MB, less than 19.31% of Java online submissions for Jewels and Stones.
     */
    public int numJewelsInStones_Three(String J, String S) {
        int jewelCount = 0 ;
        for( int i = 0; i < S.length(); i++ ) {
            for(int j = 0; j < J.length(); j++) {
                if(S.charAt(i) == J.charAt(j)) {
                    jewelCount++;
                    break;
                }
            }
        }
        return jewelCount;
    }

}

