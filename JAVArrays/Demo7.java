package JAVArrays;
///this is my version
public class Demo7 {
      public static int maxProfit(int[] prices) {
        int max=0;
        for(int buy = 0 ;buy<prices.length;buy++)
        {
            for(int sell = buy+1; sell<prices.length;sell++)
            {
                 int profit = prices[sell] - prices[buy];
                 if (profit > max) {
                    max = profit;
                }
            }
        }
        return max;
    }


    public static void main(String args[])
    {
        int[] prices={7,1,5,3,6,4};
        int n = maxProfit(prices);
        System.out.println("the max profit:"+n);
        
    }
}

//this is the optimal
/*    public static int maxProfit(int[] prices) {
        if (prices.length <= 1) {
            return 0; // No profit can be made with less than 2 prices
        }

        int maxProfit = 0;
        int minPrice = prices[0];

        for (int i = 1; i < prices.length; i++) {
            int profit = prices[i] - minPrice;
            if (profit > maxProfit) {
                maxProfit = profit;
            }
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            }
        }

        return maxProfit;
    }
 */