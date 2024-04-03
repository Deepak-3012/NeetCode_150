class Solution {
    public int maxProfit(int[] prices) {
        //TC -> O(n)
        //SC -> O(1) since we are using 2 pointer it is memory efficient
        int left = 0;
        int right = 1;
        int maxProfit = 0;
        while(right < prices.length){
            if(prices[left] < prices[right]){
                int cur_profit = prices[right] - prices[left];
                maxProfit = Math.max(cur_profit, maxProfit);
            }
            else{
                left = right;
            }
            right ++;
        }
        return maxProfit;
    }
}