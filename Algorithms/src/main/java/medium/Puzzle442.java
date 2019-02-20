package medium;

import java.util.ArrayList;
import java.util.List;

/**
 * Given an array of integers, 1 ≤ a[i] ≤ n (n = size of array), some elements appear twice and others appear once.
 *
 * Find all the elements that appear twice in this array.
 *
 * Could you do it without extra space and in O(n) runtime?
 *
 * Example:
 * Input:
 * [4,3,2,7,8,2,3,1]
 *
 * Output:
 * [2,3]
 */
public class Puzzle442 {

    /**
     *
     * Boolean array having size n+1, whenever you have visited the node mark the index location as true.
     * If the boolean array index is already marked as true then that is duplicate.
     *
     * @param nums
     * @return
     *
     * Runtime: 6 ms, faster than 99.89% of Java online submissions for Find All Duplicates in an Array.
     * Memory Usage: 51.8 MB, less than 100.00% of Java online submissions for Find All Duplicates in an Array.
     */
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> duplicate = new ArrayList<>();
        boolean [] flag = new boolean[nums.length+1];
        for( int i = 0; i < nums.length ; i++) {
            if(flag[nums[i]])
                duplicate.add(nums[i]);
            flag[nums[i]] = true;
        }
        return duplicate;
    }
}
