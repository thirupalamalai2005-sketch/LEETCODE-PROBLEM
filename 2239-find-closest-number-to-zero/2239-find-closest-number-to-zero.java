class Solution {
    public int findClosestNumber(int[] nums) {
        int res=Integer.MAX_VALUE;
        int diff=Integer.MAX_VALUE;
        for(int num:nums){
            int temp=Math.abs(num);
            if(temp==Math.abs(res)){
                if(num>res){
                    res=num;
                }
                continue;
            }
            if(temp<diff){
                res=num;
                diff=temp;
            }
        }
        return res;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna