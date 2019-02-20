package easy;

import java.util.Arrays;

/**
 * Given two arrays, write a function to compute their intersection.
 *
 * Example 1:
 *
 * Input: nums1 = [1,2,2,1], nums2 = [2,2]
 * Output: [2,2]
 * Example 2:
 *
 * Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
 * Output: [4,9]
 * Note:
 *
 * Each element in the result should appear as many times as it shows in both arrays.
 * The result can be in any order.
 * Follow up:
 *
 * What if the given array is already sorted? How would you optimize your algorithm?
 * What if nums1's size is small compared to nums2's size? Which algorithm is better?
 * What if elements of nums2 are stored on disk, and the memory is limited such that you cannot load all elements into the memory at once?
 */
public class Puzzle350_Intersection_of_Two_Arrays {

    /**
     * Using boolean array for checking contains.
     * @param nums1 first set of numbers array.
     * @param nums2 second set of numbers array.
     * @return intersection array.
     */
    public int[] intersect(int[] nums1, int[] nums2) {
        if(nums1.length == 0 || nums2.length == 0)
            return new int[0];
        int max = 0 , min = 0;
        for(int num : nums1) {
            if(max < num) {
                max = num;
            }
            if(min > num) {
                min = num;
            }
        }
        boolean map[] = new boolean[max-min+1];
        for(int num : nums1) {
            map[num-min] = true;
        }
        for(boolean val : map) {
            System.out.print( val+"-");
        }
        int arr[] = new int[nums2.length];
        int index = 0;
        for(int num : nums2) {
            if( map.length > (num-min) && map[num-min] )
                arr[index++] = num;
        }
        return Arrays.copyOf(arr,index);
    }


}
