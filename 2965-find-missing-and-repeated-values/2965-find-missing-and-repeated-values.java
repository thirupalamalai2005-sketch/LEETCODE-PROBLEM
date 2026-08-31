class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n=grid.length;
        int arr[]=new int[n*n+1];
        int repeat=0;
        int miss=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                int temp=grid[i][j];
                arr[temp]++;
                if(arr[temp]==2){
                    repeat=temp;
                }
            }
        }
        for(int i=1;i<=n*n;i++){
            if(arr[i]==0){
                miss=i;
                break;
            }
        }
        return new int[]{repeat,miss};
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna