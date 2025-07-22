package removeDuplicatesFromSortedArray;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public int removeDuplicates(int[] nums) {
        int lengthUnique = 0;

        for(int i = 0; i < nums.length; i++){
            int numberNow =  nums[i];

            if(i == 0 || numberNow != nums[i-1]){
                nums[lengthUnique] = numberNow;
                lengthUnique++;
            }
        }

        return lengthUnique;
    }

    public static void main(String[] args) {
        Solution s = new Solution();

        int[] nums1 = {0,0,1,1,1,2,2,3,3,4};
        int[] nums2 = {3,4};

        double resultExpected = 2.5;

        double result = s.removeDuplicates(nums1);

        System.out.println("RESULT EXPECTED: " + resultExpected);
        System.out.println("RESULT: " + result );

    }
}