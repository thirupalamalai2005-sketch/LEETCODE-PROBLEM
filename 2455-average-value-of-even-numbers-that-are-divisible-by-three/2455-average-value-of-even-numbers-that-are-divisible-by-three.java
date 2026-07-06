class Solution {
    public int averageValue(int[] nums) {
        int sum=0;
        int count=0;
        int len=nums.length;
        for(int i=0;i<len;i++){
            boolean check=nums[i]%2==0 && nums[i]%3==0;
            if(check){
                sum+=nums[i];
                count++;
            }
        }
        if(sum==0){
            return 0;
        }
        return sum/count;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna