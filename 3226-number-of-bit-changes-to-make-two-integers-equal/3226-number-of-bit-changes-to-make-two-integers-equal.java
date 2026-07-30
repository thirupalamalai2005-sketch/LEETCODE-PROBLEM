class Solution {
    public int minChanges(int n, int k) {
        int diff=n^k;
        int sum=diff|n;
        if(sum==n){
            int count=0;
            while(diff>0){
                if(diff%2==1){
                    count++;
                }
                diff/=2;
            }
            return count;
        }
        return -1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna