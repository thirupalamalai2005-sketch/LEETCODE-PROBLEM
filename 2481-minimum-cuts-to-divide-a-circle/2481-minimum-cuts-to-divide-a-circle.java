class Solution {
    public int numberOfCuts(int n) {
        return (n%2==0 && n>0)?n/2:(n>1)?n:0;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna