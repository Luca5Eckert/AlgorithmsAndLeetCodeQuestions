package diagonalTraverse;

import java.util.Arrays;

public class Solution {

    public int[] findDiagonalOrder(int[][] mat) {

        int m = mat.length, n = mat[0].length;
        int j = m * n;
        int[] result = new int[j];
        int col = 0, row = 0;

        for(int i = 0; i < j; i++){
            result[i] = mat[row][col];

            if((row+col) % 2 == 0){
                if(col == n - 1) row++;
                else if (row == 0) col++;
                else {row--; col++;};
            } else {
                if(row == m - 1) col++;
                else if(col == 0) row++;
                else {row++; col--;};
            }
        }

        return result;

    }

    public static void main(String[] args) {
        int[][] board = new int[][] {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
        };

        Solution solution = new Solution();
        int[] result = solution.findDiagonalOrder(board);

        System.out.println(Arrays.toString(result));
    }

}
