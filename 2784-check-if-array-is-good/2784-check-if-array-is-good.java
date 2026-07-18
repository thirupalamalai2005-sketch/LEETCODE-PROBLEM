class Solution {
    public boolean isGood(int[] nums) {
        int len=nums.length;
        if(len==1){
            return false;
        }
        if(len==2){
            return nums[0]==1 && nums[1]==1;
        }
        int max=Integer.MIN_VALUE;
        int count[]=new int[len+1];
        for(int i=0;i<len;i++){
            int temp=nums[i];
            if(temp>len-1){
                return false;
            }
            count[temp]++;
            max=Math.max(temp,max);
        }
        boolean check=true;
        for(int i=1;i<=len;i++){
            if(count[i]==1){
                continue;
            }else if(i==len-1 & count[i]==2){
                return true;
            }else{
                return false;
            }
        }
        return false;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna