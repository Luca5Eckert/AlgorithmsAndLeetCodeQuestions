package maximum69Number;

class Solution {
    public int maximum69Number (int num) {
        int posSix = -1;
        int digitPos = 0;
        int temp = num;

        while(num > 0){
            if(num % 10 == 6){
                posSix = digitPos;
            }
            num /= 10;
            digitPos++;
        }

        if (posSix == -1) return temp;

        return temp + 3 * (int) Math.pow(10, posSix);
    }
}