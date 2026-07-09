class Solution {
   public boolean[] pathExistenceQueries(int n,int[] nums,int maxDiff,int[][] queries){
        int[] comp=new int[n];
        int compId=0;
        comp[0]=compId;
        for(int i=1;i<n;i++){
            if(nums[i]-nums[i-1]<=maxDiff){
                comp[i]=compId;
            }else{
                compId++;
                comp[i]=compId;
            }
        }
        boolean[] ans=new boolean[queries.length];
        for(int i=0;i<queries.length;i++){
            int u=queries[i][0],v=queries[i][1];
            ans[i]=(comp[u]==comp[v]);
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna