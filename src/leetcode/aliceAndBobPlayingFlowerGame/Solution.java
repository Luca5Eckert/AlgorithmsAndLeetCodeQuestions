package leetcode.aliceAndBobPlayingFlowerGame;

class Solution {
    public long flowerGame(int n, int m) {
        long imparN = (n + 1) / 2;
        long parN = n / 2;

        long imparM = (m + 1) / 2;
        long parM = m / 2;

        return (imparM * parN) + (imparN * parM);


    }
}