class Solution {
    public int maxProfit(int[] prices) {
        int buy = prices[0];
        int sell = -1;
        int price = 0;
        for(int a=0;a<prices.length-1;a++) {
            buy = prices[a];
            for(int b=a+1;b<prices.length;b++) {
                if(prices[b]>buy && prices[b]>sell)
                    sell = prices[b];
            }
            if(sell!=-1) {
                if((sell-buy)>price)
                    price = sell-buy;
            }
            sell = -1;
            //System.out.println(price);
        }
        return price;
    }
}
