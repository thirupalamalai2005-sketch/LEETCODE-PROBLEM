class Solution {
    public int maxProfit(int[] prices) {
        int sum=0;
        int len=prices.length;
        int last=prices[0];
        for(int i=1;i<len;i++){
            if(prices[i]>last){
                sum+=prices[i]-last;
            }
            last=prices[i];
        }
        return sum;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna