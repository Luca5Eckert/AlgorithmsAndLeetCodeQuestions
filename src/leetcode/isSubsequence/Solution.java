package leetcode.isSubsequence;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s == null || s.isEmpty()){
            return true;
        }

        Map<Integer,Character> tableChars = new HashMap<>();

        for(int i = 0; i < s.length(); i++){
            tableChars.put( i, s.charAt(i));
        }

        StringBuilder sequence = new StringBuilder();
        int l = 0;
        for(int i = 0; i < t.length(); i++){
            char character = t.charAt(i);

            char characterNow = tableChars.get(l);

            if( character == characterNow){
                if(l <= s.length()){
                    sequence.append(character);
                    if( l < s.length()-1){
                        l++;
                    }
                }

            }
        }

        return s.contentEquals(sequence);

    }

    public static void main(String[] args) {
        Solution s = new Solution();

        String nums1 = "b";
        String nums2 = "abc";

        System.out.println(s.isSubsequence(nums1, nums2));

    }
}
