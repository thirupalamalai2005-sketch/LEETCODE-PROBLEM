class Solution {
    public int[] leftRightDifference(int[] nums) {
        int sum=0;
        int len=nums.length;
        int arr[]=new int[len];
        for(int i=0;i<len;i++){
            sum+=nums[i];
        }
        int right[]=new int[len];
        int left[]=new int[len];
        int sum1=sum;
        for(int i=0;i<len;i++){
            right[i]=sum-nums[i];
            sum-=nums[i];
        }
        for(int i=len-1;i>0;i--){
            left[i]=sum1-nums[i];
            sum1-=nums[i];
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=Math.abs(left[i]-right[i]);
        }
        return nums;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna