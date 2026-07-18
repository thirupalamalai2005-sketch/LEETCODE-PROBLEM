class Solution {
    public int findNonMinOrMax(int[] nums) {
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int len=nums.length;
        if(len==2 || len==1){
            return -1;
        }
        for(int i=0;i<len;i++){
            int temp=nums[i];
            max=Math.max(temp,max);
            min=Math.min(temp,min);
        }
        for(int i=0;i<len;i++){
            int tem=nums[i];
            if(tem>min && tem<max){
                return tem;
            }
            
        }
        return max;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna