class Solution {
    public int minimumCost(int[] cost) {
        int res[]=new int[101];
        int sum=0;
        int len=cost.length;
        for(int i=0;i<len;i++){
            res[cost[i]]++;
        }
        int i=2;
        for(int j=100;j>=0;j--){
            if(res[j]==0) continue;
            while(res[j]>0){
                if(i>0){
                sum+=j;
                i--;
                }else{
                  i=2;
                }
                res[j]--;
            }
        }
        return sum;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna