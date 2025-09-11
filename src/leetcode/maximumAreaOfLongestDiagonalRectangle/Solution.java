package leetcode.maximumAreaOfLongestDiagonalRectangle;

class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int maxDig = 0, maxArea = 0;
        int m = dimensions.length;

        for(int i = 0; i < m; i++){
            int l = dimensions[i][0];
            int w = dimensions[i][1];
            int currDiag = l * l + w * w;

            if(currDiag > maxArea || (currDiag == maxArea && l * w > maxDig)){
                maxArea = currDiag;
                maxDig = l * w;
            }
        }

        return maxDig;

    }
}