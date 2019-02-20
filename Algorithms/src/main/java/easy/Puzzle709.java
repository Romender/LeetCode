package easy;


/**
 * Implement function ToLowerCase() that has a string parameter str, and returns the same string in lowercase.
 *
 * Example 1:
 *
 * Input: "Hello"
 * Output: "hello"
 *
 * Example 2:
 * Input: "here"
 * Output: "here"
 *
 * Example 3:
 * Input: "LOVELY"
 * Output: "lovely"
 */
public class Puzzle709 {

    /**
     *
     * @param str input String
     * @return lower case String
     * Runtime: 0 ms, faster than 100.00% of Java online submissions for To Lower Case.
     * Memory Usage: 25.8 MB, less than 6.87% of Java online submissions for To Lower Case.
     */
    public String toLowerCase(String str) {
        StringBuffer sb = new StringBuffer();
        for ( int i = 0; i < str.length() ; i++) {
            if(((int)str.charAt(i)) >= 65 && ((int)str.charAt(i)) <= 90)
                sb.append(((char)(((int)str.charAt(i))+32)));
            else
                sb.append(str.charAt(i));
        }
        return sb.toString();
    }
}
