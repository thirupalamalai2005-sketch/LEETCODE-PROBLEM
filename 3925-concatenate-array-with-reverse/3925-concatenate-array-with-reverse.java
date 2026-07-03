class Solution {
    public int[] concatWithReverse(int[] nums) {
        int len1=nums.length;
        int arr[]=new int[len1*2];
        int len=arr.length;
        for(int i=0;i<len1;i++){
            arr[i]=nums[i];
            arr[len-i-1]=nums[i];
        }
        return arr;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna