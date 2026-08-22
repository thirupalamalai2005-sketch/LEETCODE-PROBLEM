class Solution {
    public int[] transformArray(int[] nums) {
        int even=0;
        int len=nums.length;
        for(int num:nums){
            if(num%2==0){
                even++;
            }
        }
        int arr[]=new int[len];
        for(int i=even;i<len;i++){
            arr[i]=1;
        }
        return arr;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna