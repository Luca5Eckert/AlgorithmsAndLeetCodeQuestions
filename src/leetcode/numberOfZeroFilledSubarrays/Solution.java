package leetcode.numberOfZeroFilledSubarrays;

public class Solution {

    public long zeroFilledSubarray(int[] nums) {
        int numberOfZero = 0;
        int sequence = 0;

        for(int i = 0; i < nums.length; i++){
            int number = nums[i];

            if(number == 0){
                sequence++;
                numberOfZero += sequence;
            } else {
                sequence = 0;
            }
        }

        return numberOfZero;

    }
}
