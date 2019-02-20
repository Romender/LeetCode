package easy;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;


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
public class Puzzle350_Intersection_of_Two_ArraysTest {

    /**
     * Input: nums1 = [1,2,2,1], nums2 = [2,2]
     * Output: [2,2]
     */
    @Test
    public void intersect_base1() {
        int [] arr1 = {1,2,2,1};
        int [] arr2 = {2,2};
        Puzzle350_Intersection_of_Two_Arrays test = new Puzzle350_Intersection_of_Two_Arrays();
        int result[] = test.intersect(arr1,arr2);
        assertThat(result).contains(2);
        assertThat(result).hasSize(2);
    }

    /**
     * Input: nums1 = [1,2,2,1], nums2 = [2,2]
     * Output: [2,2]
     */
    @Test
    public void intersect_base2() {
        int [] arr1 = {9,4,9,8,4};
        int [] arr2 = {4,9};
        Puzzle350_Intersection_of_Two_Arrays test = new Puzzle350_Intersection_of_Two_Arrays();
        int result[] = test.intersect(arr1,arr2);
        assertThat(result).contains(4,9);
        assertThat(result).hasSize(2);
    }

    /**
     * Input: nums1 = [], nums2 = [2]
     * Output: []
     */
    @Test
    public void intersect_base3() {
        int [] arr1 = {};
        int [] arr2 = {2};
        Puzzle350_Intersection_of_Two_Arrays test = new Puzzle350_Intersection_of_Two_Arrays();
        int result[] = test.intersect(arr1,arr2);
        assertThat(result).isEmpty();
    }

    /**
     * Input: nums1 = [1], nums2 = [1,2]
     * Output: [1]
     */
    @Test
    public void intersect_base4() {
        int [] arr1 = {1};
        int [] arr2 = {1,2};
        Puzzle350_Intersection_of_Two_Arrays test = new Puzzle350_Intersection_of_Two_Arrays();
        int result[] = test.intersect(arr1,arr2);
        assertThat(result).contains(1);
    }

    /**
     * [-2147483648,1,2,3]
     * [1,-2147483648,-2147483648]
     */
    @Test
    public void intersect_base5(){
        int arr1[] = {-2147483648,1,2,3};
        int arr2[] = {1,-2147483648,-2147483648};
        Puzzle350_Intersection_of_Two_Arrays test = new Puzzle350_Intersection_of_Two_Arrays();
        int result[] = test.intersect(arr1,arr2);
        assertThat(result).contains(1,-2147483648);
        assertThat(result).hasSize(3);
    }
}