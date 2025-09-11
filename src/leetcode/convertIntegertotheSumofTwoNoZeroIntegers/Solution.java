package leetcode.convertIntegertotheSumofTwoNoZeroIntegers;

class Solution {

    public int[] getNoZeroIntegers(int n) {

        for(int i = 1; i < n; i++){
            int left = n - i;

            if(
                    !String.valueOf(i).contains("0")
                            && !String.valueOf(left).contains("0")
            ){
                return new int[]{i, left};
            }
        }

        return null;

    }
}