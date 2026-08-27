class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int le=nums.length;
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        int ws=sum;
        for(int j=k;j<le;j++){
            sum+=nums[j]-nums[j-k];
            ws=Math.max(ws,sum);
        }
        return (double)ws/k;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna