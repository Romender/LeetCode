package easy;

public class P70_climbing_stairs {

    public int climbStairs(int n) {
        if(n ==0 || n == 1)
            return 1;
        int arr[] = new int[n+1];
        arr[0] = 1;
        arr[1] = 1;
        return climbStairs(n, arr);
    }

    private int climbStairs(int n, int[] arr) {
        if (arr[n] != 0)
            return arr[n];
        else
            arr[n] = climbStairs(n-1, arr) + climbStairs(n-2, arr);
        return arr[n];
    }
}
