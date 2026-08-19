class Solution {
    public int sumOfGoodNumbers(int[] nums, int k) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            if(i-k>=0 && i-k<nums.length && i+k>=0 && i+k<nums.length){
                if(nums[i]>nums[i-k] && nums[i]>nums[i+k]){
                    sum+=nums[i];
                }
            }
            else if(i-k>=0 && i-k<nums.length){
                if(nums[i]>nums[i-k]){
                    sum+=nums[i];
                }
            }
            else if(i+k>=0 && i+k<nums.length){
                if(nums[i]>nums[i+k]){
                    sum+=nums[i];
                }
            }else if(i-k<0 && i+k>nums.length){
                sum+=nums[i];
            }
        }
        return sum;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna