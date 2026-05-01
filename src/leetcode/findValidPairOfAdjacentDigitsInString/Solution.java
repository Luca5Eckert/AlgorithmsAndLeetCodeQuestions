class Solution {

    public String findValidPair(String s) {
        int[] count = new int[10];

        for(char c : s.toCharArray()){
            count[c - '0']++;
        }

        for(int i = 1; i < s.length(); i++){
            int v1 = s.charAt(i - 1) - '0';
            int v2 = s.charAt(i) - '0';
            
            if (v1 != v2 && count[v1] == v1 && count[v2] == v2) {
                return s.substring(i - 1, i + 1); 
            }
        }

        return "";
    }

}