package easy;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * Given an array of integers where 1 ≤ a[i] ≤ n (n = size of array), some elements appear twice and others appear once.
 *
 * Find all the elements of [1, n] inclusive that do not appear in this array.
 *
 * Could you do it without extra space and in O(n) runtime? You may assume the returned list does not count as extra space.
 *
 * Example:
 *
 * Input:
 * [4,3,2,7,8,2,3,1]
 *
 * Output:
 * [5,6]
 *
 */
public class Puzzle448 {

    /**
     *
     * Create a boolean array same size as input array, iterate over the boolean array and all index whose value is
     * false is the missing values in the list
     *
     * @param nums Array number
     * @return List of number which doesn't appear in list
     *
     * Runtime: 6 ms, faster than 99.72% of Java online submissions for Find All Numbers Disappeared in an Array.
     * Memory Usage: 51.5 MB, less than 100.00% of Java online submissions for Find All Numbers Disappeared in an Array.
     *
     */
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();
        boolean flag [] = new boolean[nums.length];
        for( int i = 0; i < nums.length ; i++ ) {
           flag[nums[i]-1] = true;
        }
        for(int i = 0; i < flag.length; i++) {
            if(!flag[i])
                result.add(i+1);
        }
        return result;
    }
}
