package leetcode.climbingStairs;

class Solution {
    public int climbStairs(int n) {
        if(n <= 3) return n;

        int ways = 0;
        int prev1 = 3;
        int prev2 = 2;

        for(int i = 3; i < n; i++){
            ways = prev1 + prev2;
            prev2 = prev1;
            prev1 = ways;
        }
        return ways;
    }


    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.climbStairs(4));
    }
}