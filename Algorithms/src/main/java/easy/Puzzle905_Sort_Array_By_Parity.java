package easy;

import java.util.Arrays;

/**
 * Given an array A of non-negative integers, return an array consisting of all the even elements of A, followed by all the odd elements of A.
 *
 * You may return any answer array that satisfies this condition.
 *
 *
 *
 * Example 1:
 *
 * Input: [3,1,2,4]
 * Output: [2,4,3,1]
 * The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.
 *
 *
 * Note:
 *
 * 1 <= A.length <= 5000
 * 0 <= A[i] <= 5000
 */
public class Puzzle905_Sort_Array_By_Parity {

    /**
     *
     * @param A Array.
     * @return Even elements first then odd elements next
     */
    public int[] sortArrayByParity(int[] A) {
        int even[] = new int[A.length];
        int odd[] = new int[A.length];
        int j = 0 , k = 0;
        for(int i = 0 ; i < A.length ; i++) {
            if(A[i] % 2 == 0)
                even[j++] = A[i];
            else
                odd[k++] = A[i];
        }
        int i= 0;
        for(; i < j; i++)
            A[i] = even[i];
        for(int l = 0 ;l < k; l++)
            A[i++] = odd[l];
        return A;
    }
}
