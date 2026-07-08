class Solution {
    public static int check(int val){
        int sum=0;
        while(val!=0){
            sum+=val%10;
            val/=10;
        }
        return sum;
    }

    public int minElement(int[] nums) {
        int minimum=Integer.MAX_VALUE;
        int len=nums.length;
        for(int i=0;i<len;i++){
            int temp=check(nums[i]);
            minimum=Math.min(minimum,temp);
        }    
        return minimum;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna