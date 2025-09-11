package leetcode.medianOfTwoSortedArray;

class Solution {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int lengthN = nums1.length;
        int lengthM = nums2.length;

        int n = 0;
        int m = 0;

        int lengthTotal = lengthN + lengthM;
        int mid = 0;
        int mid2 = 0;

        for(int i = 0; i < (lengthTotal/2)+1; i++ ){
            mid2 = mid;

            if(n < lengthN && m < lengthM ){
                if(nums1[n] < nums2[m]){
                    mid = nums1[n];
                    n++;
                } else {
                    mid = nums2[m];
                    m++;
                }

            } else if ( n < lengthN ){
                mid = nums1[n];
                n++;
            } else {
                mid = nums2[m];
                m++;
            }


        }

        if(lengthTotal % 2 == 0){
            return (double) (mid2 + mid) / 2;
        }

        return mid;
    }

    public static void main(String[] args) {
        Solution s = new Solution();

        int[] nums1 = {1,2};
        int[] nums2 = {3,4};

        double resultExpected = 2.5;

        double result = s.findMedianSortedArrays(nums1, nums2);

        System.out.println("RESULT EXPECTED: " + resultExpected);
        System.out.println("RESULT: " + result );

    }
}