class Solution {
    public int addDigits(int num) {
        while(num>9){
            int temp=0;
            while(num!=0){
                int t=num%10;
                temp=temp+t;
                num/=10;
            }
            num=temp;
        }
        return num;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna