class Solution {
    public int maxProfit(int[] prices) {
        int l = Integer.MAX_VALUE;
        int max = 0;
        int profit = 0;
        
        for(int i = 0; i < prices.length; i++){
            if(prices[i] < l){
                l = prices[i];
            }
            profit = prices[i] - l;
            if(max < profit){
                max = profit;
            }
        }
        return max;
    }
}
