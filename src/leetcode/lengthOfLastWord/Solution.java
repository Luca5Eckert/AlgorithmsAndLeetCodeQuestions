package leetcode.lengthOfLastWord;

class Solution {
    public int lengthOfLastWord(String s) {
        int n = s.length();
        int i = n - 1;
        int length = 0;

        while (i > 0 && s.charAt(i) == ' ') {
            i--;
        }
        while (i >= 0 && s.charAt(i) != ' ') {
            length++;
            i--;
        }

        return length;
    }

    public static void main(String[] args) {
        Solution s = new Solution();

        System.out.println(s.lengthOfLastWord("a"));

    }
}