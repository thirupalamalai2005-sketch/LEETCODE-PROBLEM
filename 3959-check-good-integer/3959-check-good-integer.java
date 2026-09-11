class Solution {
    public boolean checkGoodInteger(int n) {
        int res=0;
        while(n>0){
            int temp=n%10;
            res-=temp;
            res+=temp*temp;
            n/=10;
        }
        return res>=50;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna