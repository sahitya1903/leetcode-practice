class Solution {
    public int maxProfit(int[] prices) {
        int maxprofit=0;
        int mincost=prices[0];
        for(int i=0;i<prices.length;i++){
            int profit=prices[i]-mincost;
            if(profit<0) mincost=prices[i];
            else if(profit>0 && profit>maxprofit) maxprofit=profit;
        }
        return maxprofit;
    }
}
