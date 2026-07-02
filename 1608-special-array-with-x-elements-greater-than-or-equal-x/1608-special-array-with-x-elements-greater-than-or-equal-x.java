class Solution {
    public int specialArray(int[] nums) {
        for(int i=1;i<=nums.length;i++){
            int res=0;
            for(int j=0;j<nums.length;j++){
                if(i<=nums[j]){
                    res++;
                }
            }
            if(res==i){
                return i;
            }
        }
        return -1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna