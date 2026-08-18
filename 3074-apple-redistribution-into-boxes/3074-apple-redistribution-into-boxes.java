class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int cap[]=new int[51];
        int sum=0;
        int count=0;
        for(int num:apple){
            sum+=num;
        }
        for(int num:capacity){
            cap[num]++;
        }
        for(int i=50;i>0;i--){
            while(cap[i]>0){
                count++;
                sum-=i;
                cap[i]--;
                if(sum<=0){
                    return count;
                }
            }
        }
        return 0;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna