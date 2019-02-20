package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Given two arrays, write a function to compute their intersection.
 *
 * Example 1:
 *
 * Input: nums1 = [1,2,2,1], nums2 = [2,2]
 * Output: [2]
 * Example 2:
 *
 * Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
 * Output: [9,4]
 * Note:
 *
 * Each element in the result must be unique.
 * The result can be in any order.
 */
public class Puzzle349 {

    /**
     *
     * Add all element to set and check whether element available in SET.
     *
     * @param nums1 array one
     * @param nums2 array two
     * @return array
     *
     * Runtime: 3 ms, faster than 68.76% of Java online submissions for Intersection of Two Arrays.
     * Memory Usage: 35.4 MB, less than 100.00% of Java online submissions for Intersection of Two Arrays.
     */
    public int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> intersection = new ArrayList();
        Set t = new HashSet();
        for(int num : nums1)
            t.add(num);
        for(int num : nums2) {
            if(t.add(num)){
                intersection.add(num);
            } else {
                t.remove(num);
            }
        }
        int [] res = new int[intersection.size()];
        int i =0;
        for(int x: intersection)
            res[i++] = x;
        return res;
    }


    /**
     *  o(n*m) time complexity.
     *
     * @param nums1 array one
     * @param nums2 array two
     * @return array
     *
     * Runtime: 8 ms.
     * Memory Usage: 38.2 MB.
     */
    public int[] intersection_second(int[] nums1, int[] nums2) {
        Set<Integer> intersection = new HashSet<>();
       for ( int i = 0 ; i < nums1.length ;i ++) {
           for(int j = 0 ;j < nums2.length; j++) {
               if(nums1[i] == nums2[j]) {
                   intersection.add(nums1[i]);
                   break;
               }
           }
       }
        int [] res = new int[intersection.size()];
        int i =0;
        for(int x: intersection)
            res[i++] = x;
        return res;
    }

    /**
     *  Using HashMap.
     *
     * @param nums1 array one
     * @param nums2 array two
     * @return array
     *
     * Runtime: 2 ms, faster than 98.84% of Java online submissions for Intersection of Two Arrays.
     * Memory Usage: 37.4 MB, less than 100.00% of Java online submissions for Intersection of Two Arrays.
     */
    public int[] intersection_HashMap(int[] nums1, int[] nums2) {
        Set<Integer> intersection = new HashSet<>();
        Map<Integer,Integer> map = new HashMap<>();
        for(int num : nums1) {
            map.put(num,num);
        }
        for(int num : nums2) {
            if(map.containsKey(num))
                intersection.add(num);
        }
        int [] res = new int[intersection.size()];
        int i =0;
        for(int x: intersection)
            res[i++] = x;
        return res;
    }

    /**
     * Using boolean array instead of using Hashmap.
     *
     */
    public int[] intersection_booleanArray(int[] nums1, int []nums2) {
        int max = Integer.MAX_VALUE, min = Integer.MIN_VALUE;
        for(int num : nums1) {
            max = Integer.max(num, max);
            min = Integer.min(num, min);
        }
        boolean []mapArray = new boolean[max-min+1];
        for(int num : nums1) {
            mapArray[num-min] = true;
        }
        int len = 0;
        int arr[] = new int[nums2.length];
        for(int num :nums2) {
            if(mapArray[num-min])
                arr[len++] = num;
        }
        return Arrays.copyOf(arr,len);
    }

}
