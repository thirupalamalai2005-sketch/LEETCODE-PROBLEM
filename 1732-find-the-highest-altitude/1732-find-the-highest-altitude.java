class Solution {
    public int largestAltitude(int[] gain) {
        int sum=0;
        int len=gain.length;
        int val=0;
        for(int i=0;i<len;i++){
            val+=gain[i];
            sum=Math.max(sum,val);
        }
        return sum;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna