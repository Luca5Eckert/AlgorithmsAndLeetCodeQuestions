package leetcode.searchInRotatedSortedArrayII;

class Solution {
    public boolean search(int[] nums, int target) {
        int right = nums.length - 1;
        int left = 0;

        while(right >= left){
            int mid = left + (right - left) / 2;

            if(nums[mid] == target) return true;

            if(nums[mid] <= target || nums[left] > target){
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return false;

    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.search(new int[]{1,0,1,1,1}, 0)
);
    }
}