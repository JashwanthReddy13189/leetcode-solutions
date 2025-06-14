class Solution {
    public int maxProfit(int[] prices) {
        // We will update min when new price value is less than min
        // we will update profit when price - min is greater than profit
        int minPrice = Integer.MAX_VALUE, maxProfit = 0;
        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;
            } else {
                maxProfit = Math.max(maxProfit, price - minPrice);
            }
        }
        return maxProfit;
    }
}