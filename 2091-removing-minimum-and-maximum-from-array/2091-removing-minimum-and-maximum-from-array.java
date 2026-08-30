class Solution {
    public int minimumDeletions(int[] nums) {
        int len=nums.length;
        if(len<3){
            return len;
        }
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int k=0;
        int j=0;
        for(int i=0;i<len;i++){
            int temp=nums[i];
            if(temp>max){
                max=temp;
                k=i;
            }
            if(temp<min){
                min=temp;
                j=i;
            }
        }
        int n=Math.max(k+1,j+1);
        int m=len-Math.min(k,j);
        if(Math.min(k+1,j+1)+len-Math.max(k,j)>Math.min(n,m)){
            return Math.min(n,m);
        }
        return Math.min(k+1,j+1)+len-Math.max(k,j);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna