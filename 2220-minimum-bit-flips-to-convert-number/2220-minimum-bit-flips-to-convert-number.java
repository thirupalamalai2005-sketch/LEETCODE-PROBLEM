class Solution {
    public int minBitFlips(int start, int goal) {
        int check=start^goal;
        int count=0;
        while(check!=0){
            count+=check&1;
            check>>>=1;
        }
        return count;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna