package leetcode.moveZeroes;

import java.util.Arrays;

public class Solution {

    public void moveZeroes(int[] nums) {
        int contadorNumeros = 0;
        int n = nums.length;

        for(int i = 0; i < n; i++){
            int number = nums[i ];

            if(number != 0){
                nums[contadorNumeros] = number;
                contadorNumeros++;
            }
        }

        for(int i = contadorNumeros; i < nums.length; i++){
            nums[i] = 0;
        }

    }


    public static void main(String[] args) {
        Solution s = new Solution();

        int[] nums1 = {0,1,0,3,12};

        int[] resultExpected = {1,3,12,0,0};

        s.moveZeroes(nums1);

        if(Arrays.equals(nums1, resultExpected)){
            System.out.println("Correct");
        } else {
            System.out.println("Incorrect");
        }

    }
}
