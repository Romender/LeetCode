package easy;

/**
 * Let's call an array A a mountain if the following properties hold:
 *
 * A.length >= 3
 * There exists some 0 < i < A.length - 1 such that A[0] < A[1] < ... A[i-1] < A[i] > A[i+1] > ... > A[A.length - 1]
 * Given an array that is definitely a mountain, return any i such that A[0] < A[1] < ... A[i-1] < A[i] > A[i+1] > ... > A[A.length - 1].
 *
 * Example 1:
 *
 * Input: [0,1,0]
 * Output: 1
 * Example 2:
 *
 * Input: [0,2,1,0]
 * Output: 1
 * Note:
 *
 * 3 <= A.length <= 10000
 * 0 <= A[i] <= 10^6
 * A is a mountain, as defined above.
 */
public class Puzzle852 {

    /**
     * Identify the maximum number from the array. with o(n)
     * @param A array of integer which represent the mountain
     * @return peak index.
     */
    public int peakIndexInMountainArray(int[] A) {
        int max = -1, index = -1;
        for( int i =0 ; i < A.length ;i ++) {
            if(max < A[i]) {
                max = A[i];
                index = i;
            }
        }
        return index;
    }


    /**
     * As the above condition specifies that Array is partially sorted so using binary search.
     * left hand side is lowest and right hand side is the highest, try to find mid and check whether mid is highest
     * or not.
     * @param A array of integer which represent the mountain
     * @return peak index.
     *
     * Runtime: 1 ms, faster than 100.00% of Java online submissions for Peak Index in a Mountain Array.
     * Memory Usage: 40.6 MB, less than 100.00% of Java online submissions for Peak Index in a Mountain Array.
     */
    public int peakIndexInMountainArray_second(int[] A) {
        int index = -1, low =0 , high = A.length, mid = (low+high)/2;
        while(true) {
            if(A[mid] > A[mid-1] && A[mid] > A[mid+1]) {
                index = mid;
                break;
            } else if(A[mid] > A[mid-1] && A[mid] < A[mid+1]) {
                low = mid;
                mid = (low + high)/2;
            } else if(A[mid] < A[mid-1]) {
                high = mid;
                mid = (low+high)/ 2;
            }

        }
        return index;
    }
}
