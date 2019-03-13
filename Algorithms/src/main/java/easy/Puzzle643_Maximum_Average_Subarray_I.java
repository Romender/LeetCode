package easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Given an array consisting of n integers, find the contiguous subarray of given length k that has the maximum average value. And you need to output the maximum average value.
 *
 * Example 1:
 *
 * Input: [1,12,-5,-6,50,3], k = 4
 * Output: 12.75
 * Explanation: Maximum average is (12-5-6+50)/4 = 51/4 = 12.75
 *
 *
 * Note:
 *
 * 1 <= k <= n <= 30,000.
 * Elements of the given array will be in the range [-10,000, 10,000].
 */
public class Puzzle643_Maximum_Average_Subarray_I {

    /**
     * Brut force method.
     * @param nums Array numbers
     * @param k size of the sub array.
     * @return maximum average.
     */
    public double findMaxAverage_bruteForce(int[] nums, int k) {
        List<Double> doubleList = new ArrayList<>();
        for(int i = 0; i+k <= nums.length ; i++) {
            int result = 0;
            for(int j = 0; j < k ; j++)
                result = result + nums[i+j];
            doubleList.add((double)result/k);
        }
        double max = Double.NEGATIVE_INFINITY;
        for(double d : doubleList)
            if(max < d)
                max = d;
        return max;
    }

    /**
     * Dynamic programming
     * @param nums Array of Integer.
     * @param k
     * @return
     */
    public double findMaxAverage(int[] nums, int k) {
        int result [] = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if(i == 0) {
                result[i] = nums[i];
            } else {
                result[i] = result[i - 1] + nums[i];
            }
            if( i-k >= 0)
                result[i]-= nums[i-k];
        }
        int max = Integer.MIN_VALUE;
        for (int i = k-1; i< result.length; i++)
            if(max < result[i])
                max = result[i];
        return ((double)max/k);
    }
}
