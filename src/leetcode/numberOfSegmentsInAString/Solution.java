package leetcode.numberOfSegmentsInAString;

class Solution {
    public int countSegments(String s) {
        if(s.isBlank()) return 0;
        int numberOfSegments = 0;

        int i = 1;
        while(s.length() > i){
            if(s.charAt(i) == ' ' && s.charAt(i-1) != ' ') numberOfSegments++;
            i++;
        }

        if(s.charAt(i - 1) != ' ') numberOfSegments++;

        return numberOfSegments;
    }
}
