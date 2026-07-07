class Solution {
    public int minOperations(int[] nums) {
        int len=nums.length;
        int count=0;
        for(int i=0;i<len-1;i++){
            int temp=nums[i+1];
            if(nums[i]<nums[i+1]){
                continue;
            }
            nums[i+1]=nums[i]+1;
            count=count+nums[i+1]-temp;
        }
        return count;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna