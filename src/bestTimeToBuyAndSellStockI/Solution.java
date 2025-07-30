package bestTimeToBuyAndSellStockI;

class Solution {
    public int maxProfit(int[] prices) {
        if(prices == null){
            return 0;
        }

        int maxProfit = 0;
        int minValue = prices[0];

        for(int i = 0; i < prices.length; i++){
            int value = prices[i];

            if(value < minValue){
                minValue = value;
            } else if( value - minValue > maxProfit){
                maxProfit = value - minValue;
            }
        }

        return maxProfit;

    }
}
