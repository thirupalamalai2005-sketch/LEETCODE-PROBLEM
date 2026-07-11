class Solution {
    public int findFinalValue(int[] nums, int original) {
        int arr[]=new int[1001];
        int len=nums.length;
        for(int i=0;i<len;i++){
            arr[nums[i]]=1;
        }
        boolean check=true;
        while(check){
            if(original>1001) return original;
            if(arr[original]!=1){
               return original;
            }
            original=original*2;
        }
        return -1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna