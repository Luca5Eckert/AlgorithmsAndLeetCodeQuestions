package reverseInteger;

class Solution {
    public int reverse(int x) {
        boolean isNegative = false;
        if(x < 0 ){
            isNegative = true;
            x = -x;
        }


        int reverse = 0;


        while(x > 0){
            int digit = x  % 10 ;
            x /= 10;
            if (reverse > (Integer.MAX_VALUE - digit) / 10) {
                return 0;
            }
            reverse = reverse * 10 + digit;
        }


        return isNegative ? -reverse : reverse;
    }


    public static void main(String[] args) {
        Solution s = new Solution();

        int reverse = s.reverse(123);

        System.out.print(reverse);
    }
}
