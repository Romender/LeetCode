package book.puzzle.chapter1;

/**
 * Is Unique: Implement an algorithm to determine if a string has all unique characters. What if you cannot use additional data structures?
 */
public class UniqueStringFinder {

    public boolean isUnique(String input) {
        int len = input.length();
        for (int i = 0; i < input.length(); i++) {
            int val = input.charAt(i);
            if(input.charAt(i) == input.charAt(val%len) && i != val%len)
                return false;
        }
        return true;
    }
}
