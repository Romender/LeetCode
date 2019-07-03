package easy;

public class P121_Best_time_to_buy_and_sell_stock {

    public int maxProfit(int[] prices) {
       int buyIndex = 0, sellIndex = 1, maxProfit = 0;
       if(prices.length <=1)
           return 0;

       while(sellIndex < prices.length) {
           if (prices[buyIndex] > prices[sellIndex]) {
              buyIndex = sellIndex;
           } else if (prices[buyIndex] < prices[sellIndex]) {
               maxProfit = Math.max(maxProfit, prices[sellIndex] - prices[buyIndex]);
           }
           sellIndex++;
       }
       return maxProfit;
    }
}
