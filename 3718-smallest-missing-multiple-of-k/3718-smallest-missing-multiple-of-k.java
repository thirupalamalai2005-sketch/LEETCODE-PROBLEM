class Solution {
    public int missingMultiple(int[] nums, int k) {
        int res[]=new int[101];
        int len=nums.length;
        for(int i=0;i<len;i++){
            res[nums[i]]=1;
        }
        int j=k;
        while(j>=0 && j<=100){
            int temp=res[j];
            if(temp==0){
                return j;
            }
            j=j+k;
        }
        return j;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna