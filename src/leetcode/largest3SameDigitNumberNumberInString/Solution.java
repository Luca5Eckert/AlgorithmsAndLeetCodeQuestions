package leetcode.largest3SameDigitNumberNumberInString;

class Solution {
    public String largestGoodInteger(String num) {
        for(int i = 9; i >= 0; i--){
            String search = "" + i + i + i;

            if(num.contains(search)){
                return search;
            }
        }

        return "";
    }
}
