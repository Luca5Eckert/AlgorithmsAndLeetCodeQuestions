package leetcode.guessNumberHigherOrLower;


public class Solution extends GuessGame {

    public Solution(int pick) {
        super(pick);
    }

    public int guessNumber(int n) {
        int l = 1;

        while(l <= n){
            int mid = l + (n - l) / 2;

            int result = guess(mid);

            if(result == 0) return mid;

            if(result == 1) {
                l = mid + 1;
            } else {
                n = mid - 1;
            }

        }

        return 0;
    }

}