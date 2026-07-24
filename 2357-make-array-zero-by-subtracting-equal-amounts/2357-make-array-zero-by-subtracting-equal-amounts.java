class Solution {
    public int minimumOperations(int[] nums) {
        int count=0;
        int len=nums.length;
        int ar[]=new int[101];
        for(int i=0;i<len;i++){
            int temp=nums[i];
            ar[temp]++;
            if(ar[temp]==1 && temp!=0){
                count++;
            }
        }
        return count;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna