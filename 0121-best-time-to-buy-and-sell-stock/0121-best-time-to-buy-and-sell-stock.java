class Solution {
    public int maxProfit(int[] prices) {
        // We will update min when new price value is less than min
        // we will update profit when price - min is greater than profit
        int min = Integer.MAX_VALUE, profit = 0;
        for (int price: prices) {
            if (price<min) {
                min = price;
            } else {
                profit = Math.max(profit, price - min);
            }
        }
        return profit;
    }
}