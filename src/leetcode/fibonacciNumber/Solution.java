package leetcode.fibonacciNumber;

import java.util.Arrays;

class Solution {
    int[] dp;

    public int fib(int n) {
        dp = new int[n+1];
        Arrays.fill(dp, -1);
        return calc(n);
    }

    public int calc(int n){
        if(n == 1 || n == 0) return n;

        if(dp[n] != -1) return dp[n];

        dp[n] =  calc(n-1) + calc(n-2);

        return dp[n];
    }
}