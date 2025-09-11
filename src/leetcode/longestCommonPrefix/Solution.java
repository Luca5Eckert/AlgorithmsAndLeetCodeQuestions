package leetcode.longestCommonPrefix;


class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs == null && strs.length == 0){
            return "";
        }

        String prefix = strs[0];
        int lengthPrefix = prefix.length();

        for( int i = 1; i < strs.length; i++){
            String s = strs[i];

            while(s.length() < lengthPrefix || !prefix.equals(s.substring(0, lengthPrefix))){
                lengthPrefix--;
                if(lengthPrefix == 0){
                    return "";
                }
                prefix = prefix.substring(0, lengthPrefix);
            }
        }

        return prefix;
    }

}