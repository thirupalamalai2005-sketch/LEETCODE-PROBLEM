class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int len=nums.length;
        int j=Integer.MAX_VALUE;
        for(int i=0;i<len;i++){
            if(nums[i]==target){
                j=Math.min(Math.abs(i-start),j);
            }
        }
        return j;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna