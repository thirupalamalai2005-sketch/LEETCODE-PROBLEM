class Solution {
    public long sumAndMultiply(int n) {
        long sum=0;
            long mul=0;
            while(n!=0){
                sum+=n%10;
                mul=(n%10==0)?mul:mul*10+n%10;
                n/=10;
            }
            long n1=0;
            while(mul!=0){
                n1=n1*10+mul%10;
                mul/=10;
            }
            return (long)n1*sum;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna