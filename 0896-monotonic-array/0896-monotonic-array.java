class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean inc=false;
        boolean dec=false;
        for(int i=0;i<nums.length-1;i++){
            dec=nums[i]>nums[i+1] || dec;
            inc=nums[i]<nums[i+1] || inc;
        }
        return !inc||!dec;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna