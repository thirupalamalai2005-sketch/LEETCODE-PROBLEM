class Solution {
    public int findMiddleIndex(int[] nums) {
    int total=0;
    for(int n:nums){
       total+=n;
    }
    int left=0;
    for(int i=0;i<nums.length;i++){
        int right=total-left-nums[i];
        if(left==right){
            return i;
        }
        left+=nums[i];
    }
     return -1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna