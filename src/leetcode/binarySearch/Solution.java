package leetcode.binarySearch;

public class Solution {

    public int search(int[] nums, int target) {

        int n = nums.length;

        int high = n-1;
        int low = 0;

        while(high >= low){
            int mid = low + ( high - low ) / 2;
            int number = nums[mid];

            if(number == target){
                return mid;
            }

            if(number < target){
                low = mid+1;
            } else {
                high = mid-1;
            }

        }

        return -1;
    }


    public static void main(String[] args) {
        Solution s = new Solution();

        int[] nums1 = {-1,0,3,5,9,12};

        double resultExpected = 4;

        double result = s.search(nums1, 13);

        System.out.println("RESULT EXPECTED: " + resultExpected);
        System.out.println("RESULT: " + result );

    }

}
