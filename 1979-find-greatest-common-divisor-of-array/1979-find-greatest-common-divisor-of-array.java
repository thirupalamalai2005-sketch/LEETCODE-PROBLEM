class Solution {
    public static int gcd(int a,int b){
        if(b==0){
            return a;
        }
        return gcd(b,a%b);
    }
    public int findGCD(int[] nums) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int len=nums.length;
        for(int i=0;i<len;i++){
            int temp=nums[i];
            min=Math.min(temp,min);
            max=Math.max(temp,max);
        }
        return gcd(max,min); 
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna