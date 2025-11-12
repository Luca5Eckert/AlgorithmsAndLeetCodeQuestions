package leetcode.ValidAnagram;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;

        Map<Character, Integer> freq = new HashMap<>();

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);

            int frequenceChar = freq.getOrDefault(c, 0) + 1;
            freq.put(c, frequenceChar);
        }

        for(int i = 0; i < t.length(); i++){
            char c = t.charAt(i);

            int frequenceChar = freq.getOrDefault(c, 0);

            if(frequenceChar <= 0){
                return false;
            }

            freq.put(c, frequenceChar - 1);
        }

        return true;
    }
}
