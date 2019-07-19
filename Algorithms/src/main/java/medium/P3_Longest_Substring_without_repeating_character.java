package medium;

import java.util.HashSet;
import java.util.Set;

public class P3_Longest_Substring_without_repeating_character {

    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        Set<Character> charset = new HashSet<>();
        for(int x = 0, y = 1; y < s.length(); ) {
               if (s.charAt(x) == s.charAt(y) || charset.contains(s.charAt(y))) {
                   charset.clear();
                   charset.add(s.charAt(y));
                   maxLength = y - x;
                   x = y++;
               } else {
                   charset.add(s.charAt(y++));
               }

        }
        return maxLength;
    }
}
