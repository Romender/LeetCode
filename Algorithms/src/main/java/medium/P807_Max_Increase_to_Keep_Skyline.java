package medium;

public class P807_Max_Increase_to_Keep_Skyline {

    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int top_bottom_mx [] = new int[grid.length];
        int left_right_mx [] = new int [grid.length];
        for (int i = 0 ;i < grid.length; i++) {
            for( int j =0 ; j< grid[i].length; j++) {
                left_right_mx[i] = Math.max(left_right_mx[i], grid[i][j]);
                top_bottom_mx[i] = Math.max(top_bottom_mx[i],grid[j][i]);
            }
        }
        int result = 0;
        for (int i = 0 ;i < grid.length; i++) {
            for( int j =0 ; j< grid[i].length; j++) {
                result += Math.min(left_right_mx[i],top_bottom_mx[j]) - grid[i][j];
            }
        }
        return result;
    }

}
