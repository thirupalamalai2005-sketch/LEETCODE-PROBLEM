class Solution {
    public int averageValue(int[] nums) {
        int sum=0;
        int count=0;
        int len=nums.length;
        for(int i=0;i<len;i++){
            boolean check=nums[i]%2==0 ;
            boolean check1=nums[i]%3==0;
            if(check && check1){
                sum+=nums[i];
                count++;
            }
        }
        return sum==0?0:sum/count;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna