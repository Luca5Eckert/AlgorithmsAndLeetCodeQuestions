package jumpGame;

class Solution {
    public boolean canJump(int[] nums) {
        int finalJump = nums.length-1;

        for(int i = nums.length-1; i > 0; i--){
            int capacityJump = nums[i-1];

            if(capacityJump + i-1 >= finalJump){
                finalJump = i-1;
            }

        }

        if(finalJump>0){
            return false;
        }
        return true;

    }

    public static void main(String[] args) {
        Solution s = new Solution();

        int[] prices = {3,2,1,0,4};

        boolean resultExpected = false;

        boolean result = s.canJump(prices);

        System.out.println("Result: " + result);
        System.out.println("Result Expected: "+ resultExpected);
    }
}