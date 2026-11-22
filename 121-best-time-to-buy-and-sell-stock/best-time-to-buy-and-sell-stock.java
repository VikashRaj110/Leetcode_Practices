class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int maxProfit = 0;
        int buyPrice = prices[0];
       for(int i =1;i<n;i++){
          /// Calculate profit if we sell today
          int currentProfit = prices[i]-buyPrice;

        // Update maximum profit
          if(currentProfit>maxProfit)
          maxProfit = currentProfit;
           
         // Update minimum buying price
          if(prices[i]< buyPrice)
           buyPrice =prices[i];

       } 

        return maxProfit;
    }
}