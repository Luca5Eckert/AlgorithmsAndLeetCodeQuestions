package leetcode.lengthOfLongestSubstring;

import java.util.HashSet;
import java.util.Set;

class Solution {

    public int lengthOfLongestSubstring(String s) {
        Set<Character> setTable = new HashSet<>();
        int longestSequence = 0;
        int left = 0;


        for(int right = 0; right < s.length(); right++){
            char character = s.charAt(right);


            while(setTable.contains(character)){
                setTable.remove(s.charAt(left));
                left++;
            }


            setTable.add(character);


            int tempSequence = right - left + 1;


            if(tempSequence > longestSequence){
                longestSequence = tempSequence;
            }
        }
        return longestSequence;
    }
}

