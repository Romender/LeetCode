package easy;

import java.util.Arrays;

/**
 * Given a non-empty array of integers, every element appears twice except for one. Find that single one.
 *
 * Note:
 *
 * Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
 *
 * Example 1:
 *
 * Input: [2,2,1]
 * Output: 1
 * Example 2:
 *
 * Input: [4,1,2,1,2]
 * Output: 4
 */
public class Puzzle136_Single_Number {

    /**
     *
     * @param nums
     * @return single number
     *
     * Runtime: 1 ms, faster than 66.24% of Java online submissions for Single Number.
     * Memory Usage: 42.1 MB, less than 5.00% of Java online submissions for Single Number.
     *
     * Runtime : 34ms : Using Streams.
     * return Arrays.stream(nums).parallel().reduce((a,result) -> result = result ^ a ).orElse(0);
     *
     */
    public int singleNumber(int[] nums) {
        int result = 0;
        for(int num : nums)
            result ^= num;
        return result;
    }
}
