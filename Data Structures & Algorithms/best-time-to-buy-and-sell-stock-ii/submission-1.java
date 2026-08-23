class Solution {
    public int maxProfit(int[] prices) {
        int price = 0;
        int buy = prices[0];
        int sell = 0;
        for(int a=0;a<prices.length;a++) {
            if(a<prices.length-1) {
                if(prices[a]<prices[a+1])
                    buy = Math.min(buy,prices[a]);
            }
            if(a>0) {
                if(prices[a]>prices[a-1] && prices[a]>buy)
                    sell = Math.max(sell,prices[a]);
            }
            if((a==prices.length-1||prices[a]>prices[a+1]) && sell>buy) {
                price+=sell-buy;
                buy = sell;
                sell = 0;
            }
            System.out.println();
        }
        return price;
    }
}