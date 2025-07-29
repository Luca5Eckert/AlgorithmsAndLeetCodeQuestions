package validPalindrome;

class Solution {

    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        StringBuilder stringCorrect = new StringBuilder();

        for(int i = 0; i < s.length(); i++){
            char currenteChar = s.charAt(i);

            if(Character.isDigit(currenteChar) || Character.isLetter(currenteChar)){
                stringCorrect.append(currenteChar);
            }
        }

        s = stringCorrect.toString();
        StringBuilder reverseString = new StringBuilder();

        for(int i = s.length()-1; i >= 0; i--){
            reverseString.append(s.charAt(i));
        }

        return (reverseString.toString()).equals(s);

    }
}