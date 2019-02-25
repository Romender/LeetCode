package hard;

import java.util.HashSet;
import java.util.Set;

/**
 * Given an unsorted integer array, find the smallest missing positive integer.
 *
 * Example 1:
 *
 * Input: [1,2,0]
 * Output: 3
 * Example 2:
 *
 * Input: [3,4,-1,1]
 * Output: 2
 * Example 3:
 *
 * Input: [7,8,9,11,12]
 * Output: 1
 * Note:
 *
 * Your algorithm should run in O(n) time and uses constant extra space.
 */
public class Puzzle41_First_Missing_Positive {

    /**
     *
     * @param nums Array of unsorted integer array.
     * @return missing first positive number
     */
    public int firstMissingPositive(int[] nums) {
        Set<Integer> intSet = new HashSet<>();
       for(int num : nums)
           intSet.add(num);
       for(int i= 1; i < Integer.MAX_VALUE; i++)
           if(intSet.add(i))
               return i;
       return 0;
    }
}
