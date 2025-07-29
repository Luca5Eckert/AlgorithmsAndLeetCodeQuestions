package isSubsequence;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s == null || s.equals("")){
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
                sequence.append(character);
                l++;
            }
        }

        return s.contentEquals(sequence);

    }

    public static void main(String[] args) {
        Solution s = new Solution();

        String nums1 = "aza";
        String nums2 = "abzba";

        System.out.println(s.isSubsequence(nums1, nums2));

    }
}
