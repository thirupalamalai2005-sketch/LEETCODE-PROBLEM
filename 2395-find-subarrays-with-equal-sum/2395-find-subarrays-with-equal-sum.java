class Solution {
    public boolean findSubarrays(int[] nums) {
        int len=nums.length-1;
        ArrayList<Integer>  lis=new ArrayList<>();
        for(int i=0;i<len;i++){
            int temp=nums[i]+nums[i+1];
            if(lis.contains(temp)){
                return true;
            }else{
                lis.add(temp);
            }
        }
        return false;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna