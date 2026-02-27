package leetcode.minimumAverageOfSmallestAndLargestElements;

import java.util.Arrays;

class Solution {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        double minAvg = Integer.MAX_VALUE;

        int left = 0;
        int right = nums.length - 1;

        while ( left < right ){
            double avg  = (nums[left] + nums[right]) / 2.0;

            minAvg = Math.min(minAvg, avg);

            left++;
            right--;
        }


        return minAvg;
    }

}