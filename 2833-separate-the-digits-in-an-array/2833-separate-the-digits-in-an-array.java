class Solution {
    public int[] separateDigits(int[] nums) {
        int len=0;
        for(int n:nums){
            len+=String.valueOf(n).length();
        }
        int ar[]=new int[len];
        int l=nums.length;
        len=len-1;
        for(int i=l-1;i>=0;i--){
            int temp=nums[i];
            while(temp>0){
                ar[len]=temp%10;
                temp/=10;
                len--;
            }
        }
        return ar;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna