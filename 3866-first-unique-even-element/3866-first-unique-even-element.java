class Solution {
    public int firstUniqueEven(int[] nums) {
        int res[]=new int[101];
        int len=nums.length;
        for(int i=0;i<len;i++){
            res[nums[i]]++;
        }
        for(int  i=0;i<len;i++){
            boolean temp=res[nums[i]]==1 && nums[i]%2==0;
            if(temp){
                return nums[i];
            }
        }
        return -1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna