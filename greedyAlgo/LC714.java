package greedyAlgo;

public class LC714 {

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] prices = {1, 3, 2, 8, 4, 9};
        int fee = 2;
        int result = sol.maxProfit(prices, fee);
        System.out.println(result); // Output: 8
    }
    
}

class Solution {
    public int maxProfit(int[] prices, int fee) {
        
        int cash = 0;           // Money in hand (no stock)
        int hold = -prices[0];  // Money in hand (holding 1 stock)

        for(int i = 1; i < prices.length; i++) {
            
            // To update cash: Do we do nothing, or do we SELL today?
            // (hold + prices[i] - fee) is exactly your (sp - cp - fee) logic!
            cash = Math.max(cash, hold + prices[i] - fee);
            
            // To update hold: Do we keep holding, or do we BUY today?
            // We subtract today's price from our available cash.
            hold = Math.max(hold, cash - prices[i]); 
        }

        // At the very end, returning 'cash' guarantees we sold our last stock
        return cash;
    }
}