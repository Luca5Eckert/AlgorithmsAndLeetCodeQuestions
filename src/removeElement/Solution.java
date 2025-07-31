package removeElement;

class Solution {
    public int removeElement(int[] nums, int val) {
        int j = 0;

        for(int i = 0; i < nums.length; i++){
            int number = nums[i];

            if(number != val){
                nums[j] = number;
                j++;
            }
        }
        return j;
    }
}