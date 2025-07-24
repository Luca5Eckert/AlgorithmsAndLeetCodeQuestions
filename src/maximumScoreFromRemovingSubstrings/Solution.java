package maximumScoreFromRemovingSubstrings;

public class Solution {

    public int maximumGain(String s, int x, int y) {
        int score = 0;
        char[] chars = s.toCharArray();
        int length = chars.length;
        char ch1 = 'a', ch2 = 'b';
        int count1 = 0, count2 = 0;

        if( x < y ){
            int temp = x;
            x = y;
            y = temp;
            ch1 = 'b';
            ch2 = 'a';
        }

        for(int i = 0; i < length; i++){
            char character = chars[i];
            if(character == ch1){
                count1++;
            } else if(character  == ch2){
                if(count1 > 0){
                    score += x;
                    count1--;
                } else {
                    count2++;
                }
            } else {
                score += Math.min(count1, count2) * y;
                count1 = 0;
                count2 = 0;
            }

        }

        if(count1 != 0){
            score += Math.min(count1, count2) * y;
        }

        return score;

    }

    public static void main(String[] args) {
        Solution s = new Solution();

        double resultExpected = 19;

        double result = s.maximumGain("cdbcbbaaabab", 4, 5);

        System.out.println("RESULT EXPECTED: " + resultExpected);
        System.out.println("RESULT: " + result );

    }
}
