package easy;

/**
 * Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array.
 *
 * Example 1:
 *
 * Input: [3,0,1]
 * Output: 2
 * Example 2:
 *
 * Input: [9,6,4,2,3,5,7,0,1]
 * Output: 8
 * Note:
 * Your algorithm should run in linear runtime complexity. Could you implement it using only constant extra space complexity?
 */
public class Puzzle268_Missing_Number {
    /**
     *
     * Boolean flags
     *
     * @param nums Array of integer
     * @return missing number
     *
     * Runtime: 0 ms, faster than 100.00% of Java online submissions for Missing Number.
     * Memory Usage: 38.4 MB, less than 89.89% of Java online submissions for Missing Number.
     *
     */
    public int missingNumber(int[] nums) {
        boolean []flags = new boolean[nums.length+1];
        for(int i = 0; i < nums.length; i++ ) {
            flags[nums[i]] = true;
        }
        for (int i= 0; i <flags.length ;i ++)
            if(!flags[i])
                return i;
            return 0;
    }
}
