package leetcode.guessNumberHigherOrLower;

public class GuessGame {
    private final int pick;

    public GuessGame(int pick) {
        this.pick = pick;
    }

    public int guess(int num) {
        return Integer.compare(num, pick);
    }

}
