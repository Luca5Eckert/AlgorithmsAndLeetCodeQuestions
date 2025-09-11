package leetcode.longestPalindromicSubstring;

public class Solution {

    public String longestPalindrome(String s) {
        int n = s.length()-1;
        String longestString = s.substring(0,1);

        for(int i = 0; i < n; i++){
            String odd = expenseString(s,i,i);
            String even = expenseString(s,i,i+1);

            if(odd.length() > longestString.length()){
                longestString = odd;
            }
            if(even.length() > longestString.length()){
                longestString = even;
            }
        }
        return longestString;
    }

    public String expenseString(String s, int left, int right){

        while((left >= 0 && right < s.length()) && (s.charAt(left) == s.charAt(right))){
            left--;
            right++;
        }

        return s.substring(left+1,right);

    }


    public static void main(String[] args) {
        Solution s = new Solution();

        String test = "bb";

        String resultExpected = "bb";

        String result = s.longestPalindrome(test);

        System.out.println("RESULT EXPECTED: " + resultExpected);
        System.out.println("RESULT: " + result );

    }
}
