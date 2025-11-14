package leetcode.maximumRepeatingSubstring;

class Solution {
    public int maxRepeating(String sequence, String word) {
        int k = 0;
        String build = word;

        while(sequence.contains(build)){
            k++;
            build += word;
        }
        return k;
    }
}