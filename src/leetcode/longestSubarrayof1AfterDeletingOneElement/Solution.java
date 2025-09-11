package leetcode.longestSubarrayof1AfterDeletingOneElement;

class Solution {
    public int longestSubarray(int[] nums) {
        int numberOfZero = 0;
        int j = 0;
        int l = 0;
        int max = 0;

        for(int i = 0; i < nums.length; i++){
            int number = nums[i];

            if(number == 1){
                j++;
            } else if (number == 0) {
                numberOfZero++;
            }

            while(numberOfZero > 1){
                if(nums[l] == 0){
                    numberOfZero--;
                }
                l++;
            }

            if(max < (i - l)){
                max = i - l;
            }

        }

        return max;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        solution.longestSubarray(new int[]{0,1,1,1,0,1,1,0,1});
    }
}