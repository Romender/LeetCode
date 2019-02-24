package easy;

import java.util.HashSet;
import java.util.Set;

/**
 * In a array A of size 2N, there are N+1 unique elements, and exactly one of these elements is repeated N times.
 *
 * Return the element repeated N times.
 *
 *
 *
 * Example 1:
 *
 * Input: [1,2,3,3]
 * Output: 3
 * Example 2:
 *
 * Input: [2,1,2,5,3,2]
 * Output: 2
 * Example 3:
 *
 * Input: [5,1,5,2,5,3,5,4]
 * Output: 5
 *
 *
 * Note:
 *
 * 4 <= A.length <= 10000
 * 0 <= A[i] < 10000
 * A.length is even
 */
public class Puzzle961_N_Repeated_Element_in_Size_2N_Array {

    /**
     *
     * @param A array
     * @return N times repeated element
     *
     * Runtime: 4 ms, faster than 99.98% of Java online submissions for N-Repeated Element in Size 2N Array.
     * Memory Usage: 41.4 MB, less than 19.32% of Java online submissions for N-Repeated Element in Size 2N Array.
     */
    public int repeatedNTimes(int[] A) {
        Set<Integer> intSet = new HashSet<>();
        for(int num :A) {
            if(!intSet.add(num))
                return num;
        }
        return 0;
    }
}
