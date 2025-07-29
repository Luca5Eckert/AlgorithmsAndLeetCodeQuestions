package mergeSortedArray;

import java.util.Arrays;

public class Solution {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int l = 0;
        int j = 0;
        int[] newArray = new int[m+n];

        for(int i = 0; i < m+n; i++){

            if(l < m && j < n){

                if(nums1[l] < nums2[j]){
                    newArray[i] = nums1[l];
                    l++;
                } else {
                    newArray[i] = nums2[j];
                    j++;
                }
            } else if ( l < m){
                newArray[i] = nums1[l];
                l++;
            } else {
                newArray[i] = nums2[j];
                j++;
            }
        }

        for(int i = 0; i < m+n; i++){
            nums1[i] = newArray[i];
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();

        int[] nums1 = {1};
        int[] nums2 = {};

        int[] resultExpected = {1};

        s.merge(nums1,1, nums2, 0);

        System.out.println("RESULT EXPECTED: " + resultExpected);
        System.out.println("RESULT: " + nums1 );

        if(Arrays.equals(nums1, resultExpected)){
            System.out.println("Correct");
        } else {
            System.out.println("Incorrect");
        }

    }

}
