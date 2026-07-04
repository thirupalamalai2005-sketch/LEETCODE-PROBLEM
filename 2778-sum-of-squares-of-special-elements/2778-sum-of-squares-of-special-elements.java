class Solution {
    public int sumOfSquares(int[] nums) {
        int sum=0;
        int len=nums.length;
        for(int i=1;i<=len;i++){
            if(len%i==0){
                sum+=(int)Math.pow(nums[i-1],2);
            }
        }
        return sum;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna