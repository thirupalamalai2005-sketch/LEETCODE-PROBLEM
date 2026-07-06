class Solution {
    public int averageValue(int[] nums) {
        int sum=0;
        int count=0;
        int len=nums.length-1;
        while(len>=0){
            if(nums[len]%6==0){
                sum+=nums[len];
                count++;
            }
            len--;
        }
        return sum==0?0:sum/count;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna