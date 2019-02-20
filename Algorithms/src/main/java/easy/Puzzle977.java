package easy;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * Given an array of integers A sorted in non-decreasing order, return an array of the squares of each number, also in sorted non-decreasing order.
 *
 *
 *
 * Example 1:
 *
 * Input: [-4,-1,0,3,10]
 * Output: [0,1,9,16,100]
 * Example 2:
 *
 * Input: [-7,-3,2,3,11]
 * Output: [4,9,9,49,121]
 *
 *
 * Note:
 *
 * 1 <= A.length <= 10000
 * -10000 <= A[i] <= 10000
 * A is sorted in non-decreasing order.
 */
public class Puzzle977 {

    /**
     * Square it and used normal sorting to sort the array.
     * @param A number array in ascending order.
     * @return squares of number array in ascending order.
     *
     * Runtime: 8 ms, faster than 73.52% of Java online submissions for Squares of a Sorted Array.
     * Memory Usage: 41 MB, less than 100.00% of Java online submissions for Squares of a Sorted Array.
     */
    public int[] sortedSquares_first(int[] A) {
        for( int i = 0 ; i < A.length ; i++ ) {
            A[i] = A[i] * A[i];
        }
         Arrays.sort(A);
        return A;
    }

    /**
     * As array might contains negative to positive values, identify the "0" pointer and create two pointer rolling
     * on both sides.
     *
     * Example : [ -4, -1, 0 , 2, 10]
     * P -> 0
     * i -> decrement
     * j -> increment
     * @param A number array in ascending order.
     * @return squares of number array in ascending order.
     *
     * Runtime: 59 ms, faster than 9.74% of Java online submissions for Squares of a Sorted Array.
     * Memory Usage: 42.5 MB, less than 100.00% of Java online submissions for Squares of a Sorted Array.
     */
    public int[] sortedSquares_second(int[] A) {
        int p = IntStream.range(0, A.length).filter(x -> A[x] >= 0).findFirst().orElse(0);
        int result[] = new int[A.length];
        for(int i = p-1, j = p, k = 0 ; k< A.length ; k++) {
            if(i >= 0 && j < A.length)
                result[k] = A[i]*-1 > A[j] ? A[j]*A[j++] : A[i] *A[i--];
            else if(i >= 0) {
                result[k] = A[i]*A[i--];
            } else
                result[k] = A[j]*A[j++];
        }
        return result;
    }
}
