class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean inc=false;
        boolean dec=false;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                dec=true;
                continue;
            }
            if(nums[i]<nums[i+1]){
                inc=true;
            }
        }
        return(inc&&dec)?false:true;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna