public class bestTimeToSellAndBuy {
    public int maxProfit(int[] prices) {

        int min = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {

            // Sell today
            if (prices[i] - min > maxProfit) {
                maxProfit = prices[i] - min;
            }

            // Better buying day found
            if (prices[i] < min) {
                min = prices[i];
            }
        }

        return maxProfit;
    }
}
