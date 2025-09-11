package leetcode.numberPaliodrome;

class Solution {
    public static boolean isPalindrome(int x) {

        if(x < 0){
            return false;
        }

        int copia = x;
        int reverso = 0;

        while (copia > 0){
            reverso = (reverso * 10) + (copia%10);
            copia = copia / 10;
        }

        return reverso == copia;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(1234567899));
    }


}