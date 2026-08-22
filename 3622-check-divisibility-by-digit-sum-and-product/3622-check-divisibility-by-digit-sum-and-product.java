class Solution {
    public boolean checkDivisibility(int n) {
        int temp=n;
        int sum=0;
        int product=1;
        while(temp>0){
            sum+=temp%10;
            product*=temp%10;
            temp/=10;
        }
        return n%(sum+product)==0;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna