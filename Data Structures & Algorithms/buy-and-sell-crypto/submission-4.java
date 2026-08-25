class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int buy = 0;
        int sell = 1;
        while(sell<prices.length) {
            int cost = prices[sell]-prices[buy];
            max = Math.max(max,cost);
            if(prices[sell]<prices[buy])
                buy = sell;
            sell++;
        }
        return max;
    }
}
