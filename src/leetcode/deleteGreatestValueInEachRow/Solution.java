package leetcode.deleteGreatestValueInEachRow;

import java.util.Arrays;

class Solution {
    public int deleteGreatestValue(int[][] grid) {
        for (int[] ints : grid) {
            Arrays.sort(ints);
        }

        int sum = 0;
        for(int x = grid[0].length - 1; x >= 0; x--){
            int highValue = 0;

            for (int[] ints : grid) {
                highValue = Math.max(highValue, ints[x]);
            }
            sum += highValue;
        }

        return sum;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] grid = {{1,2,4},{3,3,1}};
        System.out.println(solution.deleteGreatestValue(grid));
    }

}