package leetcode.smallestDivisibleDigitProductI;

class Solution {
    public int smallestNumber(int n, int t) {
        int i = n;

        while(getMyProduct(i) % t != 0){
            i++;
        }
        return i;


    }

    public int getMyProduct(int num){
        int product = 1;

        while(num != 0){
            product *= (num % 10);
            num = num /10;
        }

        return product;
    }
}