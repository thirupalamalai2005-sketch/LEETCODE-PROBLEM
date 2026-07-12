class Solution {
    public int maximizeExpressionOfThree(int[] nums) {
        int a=Integer.MIN_VALUE;
        int b=Integer.MIN_VALUE;
        int c=Integer.MAX_VALUE;
        int len=nums.length;
        for(int i=0;i<len;i++){
            int temp=nums[i];
            if(temp>=a){
                b=a;
                a=temp;
            }
            else if(temp<a && temp>b){
                b=temp;
            }
            c=Math.min(c,temp);
        }
        return a+b-c;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna