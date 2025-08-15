package findTheIndexOfTheFirstOccurrenceInAString;

class Solution {
    public int strStr(String haystack, String needle) {

        for(int i = 0; i <= haystack.length()-needle.length(); i++){
            String subString = haystack.substring(i, i + needle.length());

            if(needle.equals(subString)){
                return i;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        Solution s = new Solution();

        int result = s.strStr("a", "a");

        System.out.println(result);
    }
}