class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int sum=numBottles;
        while (numBottles>=numExchange) {
            int temp=numBottles/numExchange;   
            int temp1=numBottles%numExchange;    
            sum+=temp;                         
            numBottles=temp+temp1;
        }
        return sum;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna