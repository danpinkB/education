package src.sliding_window;

public class BestTimeToBuySell {
    public int maxProfit(int[] prices) {
        int min=prices[0];
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            if(prices[i]<min)
                min=prices[i];
            maxProfit = Math.max(prices[i]-min,maxProfit);
        }
        return maxProfit;
    }
}
