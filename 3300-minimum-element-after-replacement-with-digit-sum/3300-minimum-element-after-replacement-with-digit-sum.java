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
        for(int i=0;i<nums.length;i++){
            minimum=Math.min(minimum,check(nums[i]));
        }    
        return minimum;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna