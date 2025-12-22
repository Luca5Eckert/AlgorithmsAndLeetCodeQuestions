package leetcode.longestContinuousIncreasingSubsequence;

class Solution {
    public int findLengthOfLCIS(int[] nums) {
        if(nums.length == 0){
            return 0;
        }

        int largestLength = 1;
        int currentLength = 1;

        for(int i = 1; i < nums.length; i++){
            if(nums[i] > nums[i-1]){
                currentLength++;
            } else {
                currentLength = 1;
            }

            if(currentLength > largestLength){
                largestLength = currentLength;
            }
        }

        return largestLength;
    }
}