package bestTimeToBuyAndSellStockII;

public class Solution {

    public int maxProfit(int[] prices) {
        int sum = 0;

        for(int i = 1; i < prices.length; i++){
            if(prices[i] > prices[i-1]){
                sum += prices[i] - prices[i-1];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Solution s = new Solution();

        int[] prices = {7,1,5,3,6,4};

        int resultExpected = 7;

        int result = s.maxProfit(prices);

        System.out.println("Result: " + result);
        System.out.println("Result Expected: "+ resultExpected);
    }
}
