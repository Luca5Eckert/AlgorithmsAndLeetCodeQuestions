package findTheIndexOfTheFirstOccurrenceInAString;

class Solution {
    public int strStr(String haystack, String needle) {
        int pointerWord = 0;

        for(int i = 0; i < haystack.length(); i++){
            char charWord = haystack.charAt(i);

            if(charWord == needle.charAt(pointerWord)){
                pointerWord++;

                if(pointerWord >= needle.length()){
                    return i - pointerWord + 1;
                }
            } else {
                pointerWord = 0;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        Solution s = new Solution();

        s.strStr("sadbutsad", "sad");
    }
}