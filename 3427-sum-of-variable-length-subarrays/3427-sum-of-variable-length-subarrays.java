class Solution {
    public static int check(int num[],int start,int end){
        int temp=0;
        for(int i=start;i<=end;i++){
            temp+=num[i];
        }
        return temp;
    }
    public int subarraySum(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            int temp=Math.max(0,i-nums[i]);
            if(temp>i){
                sum+=check(nums,i,temp);
                continue;
            }
            sum+=check(nums,temp,i);
        }
        return sum;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna